-- MySQL dump 10.13  Distrib 8.0.35, for Win64 (x86_64)
--
-- Host: localhost    Database: VallGym
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `breakfast`
--

DROP TABLE IF EXISTS `breakfast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `breakfast` (
  `bf_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`bf_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `breakfast`
--

LOCK TABLES `breakfast` WRITE;
/*!40000 ALTER TABLE `breakfast` DISABLE KEYS */;
INSERT INTO `breakfast` VALUES (1,'Buttered mushrooms'),(2,'Marinated tofu'),(3,'Edamame'),(4,'Scrambled eggs'),(5,'Sweet potatoes');
/*!40000 ALTER TABLE `breakfast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact` (
  `contact_id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `phone_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`contact_id`),
  CONSTRAINT `contact_chk_1` CHECK ((`email` like _utf8mb4'%@%.com%')),
  CONSTRAINT `contact_chk_2` CHECK (regexp_like(`phone_no`,_utf8mb4'^[0-9]+$'))
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (5,'sequito2023@gmail.com','9951592356'),(6,'aquinocarlo21@gmail.com','9535069164'),(7,'piczon2_222@gmail.com','9169683593'),(8,'gabianakian3333@gmail.com','9951581160'),(9,'luceres22@yahoo.com',NULL),(10,'madriaga2@yahoo.com',NULL),(18,'esplanada23@gmail.com','9158276283'),(21,'guda123@gmail.com','9215212515');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curl_ups`
--

DROP TABLE IF EXISTS `curl_ups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curl_ups` (
  `curlup_id` int NOT NULL AUTO_INCREMENT,
  `count` int NOT NULL,
  PRIMARY KEY (`curlup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curl_ups`
--

LOCK TABLES `curl_ups` WRITE;
/*!40000 ALTER TABLE `curl_ups` DISABLE KEYS */;
INSERT INTO `curl_ups` VALUES (1,5),(2,10),(3,21),(4,20),(5,31);
/*!40000 ALTER TABLE `curl_ups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diet`
--

DROP TABLE IF EXISTS `diet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diet` (
  `diet_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`diet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diet`
--

LOCK TABLES `diet` WRITE;
/*!40000 ALTER TABLE `diet` DISABLE KEYS */;
INSERT INTO `diet` VALUES (1,'Atkins'),(2,'Carnivore'),(3,'Low carbohydrate'),(4,'Low fat'),(5,'Vegan'),(11,'High carbohydrates');
/*!40000 ALTER TABLE `diet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diet_breakfast`
--

DROP TABLE IF EXISTS `diet_breakfast`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diet_breakfast` (
  `diet_id` int NOT NULL,
  `bf_id` int NOT NULL,
  KEY `diet_id` (`diet_id`),
  KEY `bf_id` (`bf_id`),
  CONSTRAINT `diet_breakfast_ibfk_1` FOREIGN KEY (`diet_id`) REFERENCES `diet` (`diet_id`),
  CONSTRAINT `diet_breakfast_ibfk_2` FOREIGN KEY (`bf_id`) REFERENCES `breakfast` (`bf_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diet_breakfast`
--

LOCK TABLES `diet_breakfast` WRITE;
/*!40000 ALTER TABLE `diet_breakfast` DISABLE KEYS */;
INSERT INTO `diet_breakfast` VALUES (1,2),(2,3),(3,1),(4,4),(5,5),(11,2);
/*!40000 ALTER TABLE `diet_breakfast` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diet_dinner`
--

DROP TABLE IF EXISTS `diet_dinner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diet_dinner` (
  `diet_id` int NOT NULL,
  `dinner_id` int NOT NULL,
  KEY `diet_id` (`diet_id`),
  KEY `dinner_id` (`dinner_id`),
  CONSTRAINT `diet_dinner_ibfk_1` FOREIGN KEY (`diet_id`) REFERENCES `diet` (`diet_id`),
  CONSTRAINT `diet_dinner_ibfk_2` FOREIGN KEY (`dinner_id`) REFERENCES `dinner` (`dinner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diet_dinner`
--

LOCK TABLES `diet_dinner` WRITE;
/*!40000 ALTER TABLE `diet_dinner` DISABLE KEYS */;
INSERT INTO `diet_dinner` VALUES (1,1),(2,4),(3,4),(4,6),(5,5),(11,2);
/*!40000 ALTER TABLE `diet_dinner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diet_lunch`
--

DROP TABLE IF EXISTS `diet_lunch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diet_lunch` (
  `diet_id` int NOT NULL,
  `lunch_id` int NOT NULL,
  KEY `diet_id` (`diet_id`),
  KEY `lunch_id` (`lunch_id`),
  CONSTRAINT `diet_lunch_ibfk_1` FOREIGN KEY (`diet_id`) REFERENCES `diet` (`diet_id`),
  CONSTRAINT `diet_lunch_ibfk_2` FOREIGN KEY (`lunch_id`) REFERENCES `lunch` (`lunch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diet_lunch`
--

LOCK TABLES `diet_lunch` WRITE;
/*!40000 ALTER TABLE `diet_lunch` DISABLE KEYS */;
INSERT INTO `diet_lunch` VALUES (1,1),(2,3),(3,5),(4,4),(5,2),(11,1);
/*!40000 ALTER TABLE `diet_lunch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dinner`
--

DROP TABLE IF EXISTS `dinner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dinner` (
  `dinner_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`dinner_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinner`
--

LOCK TABLES `dinner` WRITE;
/*!40000 ALTER TABLE `dinner` DISABLE KEYS */;
INSERT INTO `dinner` VALUES (1,'Grilled mackerel'),(2,'Fried rice'),(3,'Tofu'),(4,'Homemade burger'),(5,'Peas and vegetables'),(6,'Mashed Potatoes');
/*!40000 ALTER TABLE `dinner` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jogging`
--

DROP TABLE IF EXISTS `jogging`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jogging` (
  `jogging_id` int NOT NULL AUTO_INCREMENT,
  `count` int NOT NULL,
  PRIMARY KEY (`jogging_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jogging`
--

LOCK TABLES `jogging` WRITE;
/*!40000 ALTER TABLE `jogging` DISABLE KEYS */;
INSERT INTO `jogging` VALUES (1,1),(2,2),(3,3),(4,4),(5,6);
/*!40000 ALTER TABLE `jogging` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lunch`
--

DROP TABLE IF EXISTS `lunch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lunch` (
  `lunch_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`lunch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lunch`
--

LOCK TABLES `lunch` WRITE;
/*!40000 ALTER TABLE `lunch` DISABLE KEYS */;
INSERT INTO `lunch` VALUES (1,'Salmon w/ rice'),(2,'Mixed vegetables'),(3,'Roast chicken'),(4,'Sardines with avocado'),(5,'Fried chicken breast');
/*!40000 ALTER TABLE `lunch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `member_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(40) NOT NULL,
  `last_name` varchar(40) NOT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'Joshua Karl','Sequito'),(2,'Carlos Gabriel','Aquino'),(3,'Winston Emilio','Piczon'),(4,'Melben Kian','Gabiana'),(5,'Vall James','Luceres'),(6,'Charissa Mae','Madriaga'),(21,'Jannah','Esplanada'),(25,'Mark John','Guda');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member_contact`
--

DROP TABLE IF EXISTS `member_contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member_contact` (
  `member_id` int NOT NULL,
  `contact_id` int DEFAULT NULL,
  UNIQUE KEY `contact_id` (`contact_id`),
  KEY `member_id` (`member_id`),
  CONSTRAINT `member_contact_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`),
  CONSTRAINT `member_contact_ibfk_2` FOREIGN KEY (`contact_id`) REFERENCES `contact` (`contact_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member_contact`
--

LOCK TABLES `member_contact` WRITE;
/*!40000 ALTER TABLE `member_contact` DISABLE KEYS */;
INSERT INTO `member_contact` VALUES (1,5),(2,6),(3,7),(4,8),(5,9),(6,10),(21,18),(25,21);
/*!40000 ALTER TABLE `member_contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member_workout`
--

DROP TABLE IF EXISTS `member_workout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member_workout` (
  `member_id` int NOT NULL,
  `workout_id` int NOT NULL,
  KEY `member_id` (`member_id`),
  KEY `workout_id` (`workout_id`),
  CONSTRAINT `member_workout_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `member` (`member_id`),
  CONSTRAINT `member_workout_ibfk_2` FOREIGN KEY (`workout_id`) REFERENCES `workout` (`workout_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member_workout`
--

LOCK TABLES `member_workout` WRITE;
/*!40000 ALTER TABLE `member_workout` DISABLE KEYS */;
INSERT INTO `member_workout` VALUES (1,28),(21,28),(2,30),(3,28),(4,29),(6,30);
/*!40000 ALTER TABLE `member_workout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `push_ups`
--

DROP TABLE IF EXISTS `push_ups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `push_ups` (
  `pushup_id` int NOT NULL AUTO_INCREMENT,
  `count` int NOT NULL,
  PRIMARY KEY (`pushup_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `push_ups`
--

LOCK TABLES `push_ups` WRITE;
/*!40000 ALTER TABLE `push_ups` DISABLE KEYS */;
INSERT INTO `push_ups` VALUES (1,5),(2,10),(3,15),(4,20),(5,25);
/*!40000 ALTER TABLE `push_ups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `referral_codes`
--

DROP TABLE IF EXISTS `referral_codes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `referral_codes` (
  `code_id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`code_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `referral_codes`
--

LOCK TABLES `referral_codes` WRITE;
/*!40000 ALTER TABLE `referral_codes` DISABLE KEYS */;
INSERT INTO `referral_codes` VALUES (4,'8tnhTYJ5'),(5,'e7M1OabK'),(6,'AUUgnw4V'),(7,'DNvFJ13W'),(10,'B12wyy41');
/*!40000 ALTER TABLE `referral_codes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `routine`
--

DROP TABLE IF EXISTS `routine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `routine` (
  `routine_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  PRIMARY KEY (`routine_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `routine`
--

LOCK TABLES `routine` WRITE;
/*!40000 ALTER TABLE `routine` DISABLE KEYS */;
INSERT INTO `routine` VALUES (15,'Morning exercise'),(16,'30 min exercise'),(17,'Balanced'),(18,'Basic Routine'),(19,'Intense training');
/*!40000 ALTER TABLE `routine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `routine_curlups`
--

DROP TABLE IF EXISTS `routine_curlups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `routine_curlups` (
  `routine_id` int NOT NULL,
  `curlup_id` int NOT NULL,
  KEY `routine_id` (`routine_id`),
  KEY `curlup_id` (`curlup_id`),
  CONSTRAINT `routine_curlups_ibfk_1` FOREIGN KEY (`routine_id`) REFERENCES `routine` (`routine_id`),
  CONSTRAINT `routine_curlups_ibfk_2` FOREIGN KEY (`curlup_id`) REFERENCES `curl_ups` (`curlup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `routine_curlups`
--

LOCK TABLES `routine_curlups` WRITE;
/*!40000 ALTER TABLE `routine_curlups` DISABLE KEYS */;
INSERT INTO `routine_curlups` VALUES (15,1),(16,2),(17,4),(18,1),(19,5);
/*!40000 ALTER TABLE `routine_curlups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `routine_jogging`
--

DROP TABLE IF EXISTS `routine_jogging`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `routine_jogging` (
  `routine_id` int NOT NULL,
  `jogging_id` int NOT NULL,
  KEY `routine_id` (`routine_id`),
  KEY `jogging_id` (`jogging_id`),
  CONSTRAINT `routine_jogging_ibfk_1` FOREIGN KEY (`routine_id`) REFERENCES `routine` (`routine_id`),
  CONSTRAINT `routine_jogging_ibfk_2` FOREIGN KEY (`jogging_id`) REFERENCES `jogging` (`jogging_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `routine_jogging`
--

LOCK TABLES `routine_jogging` WRITE;
/*!40000 ALTER TABLE `routine_jogging` DISABLE KEYS */;
INSERT INTO `routine_jogging` VALUES (15,3),(16,1),(17,2),(18,1),(19,4);
/*!40000 ALTER TABLE `routine_jogging` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `routine_pushups`
--

DROP TABLE IF EXISTS `routine_pushups`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `routine_pushups` (
  `routine_id` int NOT NULL,
  `pushup_id` int NOT NULL,
  KEY `routine_id` (`routine_id`),
  KEY `pushup_id` (`pushup_id`),
  CONSTRAINT `routine_pushups_ibfk_1` FOREIGN KEY (`routine_id`) REFERENCES `routine` (`routine_id`),
  CONSTRAINT `routine_pushups_ibfk_2` FOREIGN KEY (`pushup_id`) REFERENCES `push_ups` (`pushup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `routine_pushups`
--

LOCK TABLES `routine_pushups` WRITE;
/*!40000 ALTER TABLE `routine_pushups` DISABLE KEYS */;
INSERT INTO `routine_pushups` VALUES (15,4),(16,4),(17,4),(18,1),(19,5);
/*!40000 ALTER TABLE `routine_pushups` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `schedule` (
  `sched_id` int NOT NULL AUTO_INCREMENT,
  `date` varchar(40) NOT NULL,
  PRIMARY KEY (`sched_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schedule`
--

LOCK TABLES `schedule` WRITE;
/*!40000 ALTER TABLE `schedule` DISABLE KEYS */;
INSERT INTO `schedule` VALUES (1,'M Th'),(2,'W'),(3,'T F'),(4,'Weekends'),(5,'Weekdays');
/*!40000 ALTER TABLE `schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workout`
--

DROP TABLE IF EXISTS `workout`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workout` (
  `workout_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`workout_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workout`
--

LOCK TABLES `workout` WRITE;
/*!40000 ALTER TABLE `workout` DISABLE KEYS */;
INSERT INTO `workout` VALUES (27,'Calisthenics'),(28,'Abs'),(29,'Biceps'),(30,'Cardio'),(31,'Legs');
/*!40000 ALTER TABLE `workout` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workout_diet`
--

DROP TABLE IF EXISTS `workout_diet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workout_diet` (
  `workout_id` int NOT NULL,
  `diet_id` int NOT NULL,
  KEY `workout_id` (`workout_id`),
  KEY `diet_id` (`diet_id`),
  CONSTRAINT `workout_diet_ibfk_1` FOREIGN KEY (`workout_id`) REFERENCES `workout` (`workout_id`),
  CONSTRAINT `workout_diet_ibfk_2` FOREIGN KEY (`diet_id`) REFERENCES `diet` (`diet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workout_diet`
--

LOCK TABLES `workout_diet` WRITE;
/*!40000 ALTER TABLE `workout_diet` DISABLE KEYS */;
INSERT INTO `workout_diet` VALUES (27,3),(28,1),(29,2),(30,3),(31,2);
/*!40000 ALTER TABLE `workout_diet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workout_routine`
--

DROP TABLE IF EXISTS `workout_routine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workout_routine` (
  `workout_id` int NOT NULL,
  `routine_id` int NOT NULL,
  KEY `workout_id` (`workout_id`),
  KEY `routine_id` (`routine_id`),
  CONSTRAINT `workout_routine_ibfk_1` FOREIGN KEY (`workout_id`) REFERENCES `workout` (`workout_id`),
  CONSTRAINT `workout_routine_ibfk_2` FOREIGN KEY (`routine_id`) REFERENCES `routine` (`routine_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workout_routine`
--

LOCK TABLES `workout_routine` WRITE;
/*!40000 ALTER TABLE `workout_routine` DISABLE KEYS */;
INSERT INTO `workout_routine` VALUES (27,16),(28,15),(29,16),(30,16),(31,18);
/*!40000 ALTER TABLE `workout_routine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `workout_schedule`
--

DROP TABLE IF EXISTS `workout_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workout_schedule` (
  `workout_id` int NOT NULL,
  `sched_id` int NOT NULL,
  KEY `workout_id` (`workout_id`),
  KEY `sched_id` (`sched_id`),
  CONSTRAINT `workout_schedule_ibfk_1` FOREIGN KEY (`workout_id`) REFERENCES `workout` (`workout_id`),
  CONSTRAINT `workout_schedule_ibfk_2` FOREIGN KEY (`sched_id`) REFERENCES `schedule` (`sched_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `workout_schedule`
--

LOCK TABLES `workout_schedule` WRITE;
/*!40000 ALTER TABLE `workout_schedule` DISABLE KEYS */;
INSERT INTO `workout_schedule` VALUES (27,1),(28,2),(29,1),(30,4),(31,1);
/*!40000 ALTER TABLE `workout_schedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-10 15:08:10
