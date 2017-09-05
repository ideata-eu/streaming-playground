import sbt._

object Dependencies {


  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.3"

  lazy val akka = {
    val akkaVersion = "2.5.4"
    Seq(
      "com.typesafe.akka" %% "akka-actor" % akkaVersion
    )
  }

  lazy val breeze = {
    val breezeVersion = "0.13.2"

    Seq(
      "org.scalanlp" %% "breeze" % breezeVersion
    )
  }

  lazy val dateTime = {
    val version = "2.16.0"
    Seq(
      "com.github.nscala-time" %% "nscala-time" % version
    )
  }

  lazy val avro4s = {
    val version = "1.7.0"
      Seq(
        "com.sksamuel.avro4s" %% "avro4s-core" % version
      )
    }

  val kafkaAvroSerde = {
    val confluentVersion = "3.1.2"
    Seq("io.confluent" % "kafka-avro-serializer" % confluentVersion excludeAll ExclusionRule(name = "jackson-databind"),
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"
    )
  }

  val kafkaClient = {
    val kafkaVersion = "0.10.1.0"
    Seq("org.apache.kafka" % "kafka-clients" % kafkaVersion)
  }

  lazy val scopt = {
    val version = "3.6.0"
    Seq(
      "com.github.scopt" %% "scopt" % version
    )
  }

  lazy val spark16Deps = {
    Seq(
      "org.apache.spark" %% "spark-core" % "1.6.2" excludeAll ExclusionRule(name = "jackson-databind"),
      "org.apache.spark" %% "spark-streaming" % "1.6.2",
      "org.apache.spark" %% "spark-streaming-kafka" % "1.6.2",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"
    )
  }
}
