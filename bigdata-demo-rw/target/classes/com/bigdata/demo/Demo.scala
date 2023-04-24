//Read and Write parquet file
val parquetFile = sqlContext.read.parquet("C:\\Users\\Administrator\\Desktop\\parquet\\users.parquet")
parquetFile.registerTempTable("parquetFile")
val namesDF = sqlContext.sql("SELECT name FROM parquetFile WHERE age >= 13 AND age <= 19")
namesDF.map(t => "Name: " + t(0)).collect().foreach(println)
namesDF.write.parquet("C:\\Users\\Administrator\\Desktop\\parquet\\names.parquet")
