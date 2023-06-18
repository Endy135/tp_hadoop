package Jobs
import org.apache.spark
import org.apache.spark.sql.SparkSession
object Master1 extends App {
//def main(Array:args)
  val Job = "Job_master"

  val dataSeq = Seq(("Java", 20000), ("Python", 100000),("Scala", 3000))
  val spark = SparkSession
    .builder()
    .appName(Job)
    .enableHiveSupport()
    .getOrCreate()
  import spark.implicits._
  val rdd = spark.sparkContext.parallelize(dataSeq)
  val columns = Seq("Languages", "users_count")
  rdd.foreach(f => println(f))
  val df = rdd.toDF(columns:_*)

  val map = columns.map(x => x+ true)
  println(df.show)
  //val df1 = rdd.toDF(map:String)
}
