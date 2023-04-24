// create scala object with main method and print 'hello parq file generation'

import org.apache.spark.sql.SparkSession
// import dataframe
import org.apache.spark.sql.DataFrame
// fix issue 'value apache is not a member of org'
import org.apache.spark.sql.functions._

object GenerateParqFile {
  def main(args: Array[String]): Unit = {
    println("Hello Parq File Generation!")
    //print class name
    println(this.getClass.getName)
    //create spark session
    val spark = SparkSession.builder().appName("GenerateParqFile").master("local").getOrCreate()
    //create a dataframe
    val df = spark.read.json("C:\\Users\\Administrator\\Desktop\\json\\people.json")
    //write parquet file
    df.write.parquet("C:\\Users\\Administrator\\Desktop\\parquet\\users.parquet")
    //print end of program
    println("End of program")
  }
}