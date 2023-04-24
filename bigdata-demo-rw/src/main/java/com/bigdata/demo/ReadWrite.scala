//create a scala object with main method and print 'hello scala3'

//below code in main just create but not auto import the library
import org.apache.spark.sql.SparkSession
//import spark3 session
//import org.apache.spark.sql.SparkSession


object ReadWrite{
    def main(args: Array[String]): Unit = {
        println("Hello Scala3!")
        //print class name
        println(this.getClass.getName)
        //create spark session
        val spark = SparkSession.builder().appName("ReadWrite").master("local").getOrCreate()
        //read parquet file
        val parquetFile = spark.read.parquet("C:\\Users\\Administrator\\Desktop\\parquet\\users.parquet")
        //register temp table
        parquetFile.createOrReplaceTempView("parquetFile")
        //select name from parquetFile where age >= 13 and age <= 19
        val namesDF = spark.sql("SELECT name FROM parquetFile WHERE age >= 13 AND age <= 19")
        //print name
        namesDF.map(t => "Name: " + t(0)).collect().foreach(println)
        //write parquet file
        namesDF.write.parquet("C:\\Users\\Administrator\\Desktop\\parquet\\names.parquet")
        // read company json file and create dataframe companyDf
        val companyDf = spark.read.json("C:\\Users\\Administrator\\Desktop\\json\\company.json")
        // join the companyDf ( 'staffName') and namesDF with name column
        val joinDf = companyDf.join(namesDF, companyDf("staffName") === namesDF("name"))
        // print joinDf
        joinDf.show()
        //write joinDf to parquet file
        joinDf.write.parquet("C:\\Users\\Administrator\\Desktop\\parquet\\join.parquet")
        //transform the joinDf to collect staffId and name and age, address, userPayment into a new dataframe
        val transformDf = joinDf.select("staffId", "name", "age", "address", "userPayment")
        // read the bank data parquet file and create a dataframe bankDf
        val bankDf = spark.read.parquet("C:\\Users\\Administrator\\Desktop\\parquet\\bank.parquet")
        // join the bankDf (userName) and transformDf with name column and filter age >= 18 and age <= 70
        val joinBankDf = bankDf.join(transformDf, bankDf("userName") === transformDf("name")).filter("age >= 18 and age <= 70")
        // filter bank account balance > 1M user and collect 
        // userName, age, address and payment records and bankAccountBalance into a new dataframe
        val filterDf = joinBankDf.filter("bankAccountBalance > 1000000").select("userName", "age", "address", "userPayment", "bankAccountBalance")
        //print end of program
        println("End of program")
    }
}