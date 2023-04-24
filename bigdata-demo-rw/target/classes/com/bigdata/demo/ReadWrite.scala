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
        //print end of program
        println("End of program")
    }
}