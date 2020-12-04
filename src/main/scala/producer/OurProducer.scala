package producer
import org.apache.kafka.clients.producer._
import java.util.Properties

object OurProducer extends App {

  import org.apache.log4j.PropertyConfigurator

  val log4jConfPath = "log4j.properties"
  PropertyConfigurator.configure(log4jConfPath)
  writeToKafka("quickstart-events")

  def writeToKafka(topic: String): Unit = {
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    val producer = new KafkaProducer[String, String](props)
    val record = new ProducerRecord[String, String](topic, "key", "first-try")
    producer.send(record)
    producer.close()
  }
}
