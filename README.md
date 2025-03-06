# Kafka Setup Guide on Windows

This is a simple practice project demonstrating how to integrate **Spring Boot** with **Apache Kafka**.

This guide will help you set up **Apache Kafka** on Windows and run it using CMD.

## Prerequisites
- **JDK 17** or later installed ([Download](https://adoptium.net/))
- **Apache Kafka** ([Download](https://kafka.apache.org/downloads))
- **Zookeeper** (included in Kafka package)

## 1. Download & Extract Kafka
1. Download Kafka from [kafka.apache.org](https://kafka.apache.org/downloads) (Choose the latest binary version for Scala 2.13)
2. Extract it to a folder, e.g., `C:\kafka`

## 2. Start Zookeeper & Kafka

Kafka requires **Zookeeper** to manage brokers. Open a terminal (CMD) and navigate to the Kafka directory:

```sh
cd C:\kafka
```

### Start Zookeeper
```sh
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

### Start Kafka Broker
Open another CMD window and run:
```sh
bin\windows\kafka-server-start.bat config\server.properties
```

### Kafka and Zookeeper are now running!

