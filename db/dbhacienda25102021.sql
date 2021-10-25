-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: hacienda
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tabla_licencia_generada`
--

DROP TABLE IF EXISTS `tabla_licencia_generada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_licencia_generada` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido_pat` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido_mat` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `edad` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `domicilio` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_nac` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `cp` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `lugar` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `celular` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `crated_by` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `id_tipo_licencia` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tabla_licenciat_ibfk_1_idx` (`id_tipo_licencia`),
  CONSTRAINT `tabla_licenciat_ibfk_1` FOREIGN KEY (`id_tipo_licencia`) REFERENCES `tabla_tipo_licencia` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_licencia_generada`
--

LOCK TABLES `tabla_licencia_generada` WRITE;
/*!40000 ALTER TABLE `tabla_licencia_generada` DISABLE KEYS */;
INSERT INTO `tabla_licencia_generada` VALUES (1,'Jose','Caamal','Ic','20','Calle 5A','24/08/1993','97930','Peto, Yucatan','9992059252','jose','2021-10-20 10:10:28','2021-10-20 10:10:28',1);
/*!40000 ALTER TABLE `tabla_licencia_generada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_multas`
--

DROP TABLE IF EXISTS `tabla_multas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_multas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `concepto_pago` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `precio` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `created_by` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_multas`
--

LOCK TABLES `tabla_multas` WRITE;
/*!40000 ALTER TABLE `tabla_multas` DISABLE KEYS */;
INSERT INTO `tabla_multas` VALUES (1,'Exceso Velocidad','Exceso Velocidad','180','null','2021-10-18 00:52:38','2021-10-18 00:52:38'),(2,'Respeto Peatonal','Respeto Peatonal','150','jose','2021-10-18 01:27:10','2021-10-18 01:27:10'),(3,'Alcoholimetro','Alcoholimetro','100','jose','2021-10-18 01:58:04','2021-10-18 01:58:04');
/*!40000 ALTER TABLE `tabla_multas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_multas_generadas`
--

DROP TABLE IF EXISTS `tabla_multas_generadas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_multas_generadas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `folio` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `nombres` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido_pat` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido_mat` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `domicilio` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `placa_vehiculo` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `marca_vehiculo` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `nserie_vehiculo` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo_vehiculo` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `limite_pago` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created_by` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `id_multa` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tablamultas_ibfk_1_idx` (`id_multa`),
  CONSTRAINT `tablamultas_ibfk_1` FOREIGN KEY (`id_multa`) REFERENCES `tabla_multas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_multas_generadas`
--

LOCK TABLES `tabla_multas_generadas` WRITE;
/*!40000 ALTER TABLE `tabla_multas_generadas` DISABLE KEYS */;
INSERT INTO `tabla_multas_generadas` VALUES (1,'Exceso Velocidad','Jose Luis','Caamal','Ic','Calle 25','210-FF','Mercedes','2102221','Benz','03/11/2021','null','2021-10-19 18:33:23','2021-10-19 18:33:23',1),(2,'Alcoholimetro','','','','','','','','','03/11/2021','null','2021-10-19 18:42:14','2021-10-19 18:42:14',3),(3,'Exceso Velocidad','Jose Luis','Caamal','Ic','Calle 50','200Z','Mercedes','2589141ASS','400','09/11/2021','null','2021-10-25 00:46:10','2021-10-25 00:46:10',1),(4,'Respeto Peatonal','Manuel','Lopez','Chabelo','Calle 20','1520kkk','Mercedes','100KKMN','New','09/11/2021','null','2021-10-25 00:47:47','2021-10-25 00:47:47',2),(5,'Alcoholimetro','Manuel','Perez','Duran','Calle 20','990001KILO','FORD','300KKK','150','09/11/2021','null','2021-10-25 00:48:53','2021-10-25 00:48:53',3),(6,'Respeto Peatonal','Andrea','Caamal','Ic','50a','YJZ900','NEWG000','14029SJ','GOLEO','09/11/2021','null','2021-10-25 00:49:48','2021-10-25 00:49:48',2),(7,'Alcoholimetro','Manuel','Lopez','Joder','tio','chaval','x100','vamos','una','09/11/2021','null','2021-10-25 00:51:11','2021-10-25 00:51:11',3),(8,'Respeto Peatonal','Nueva','Peda','sadasd','dsaads','adsads','adsads','ads','ads','09/11/2021','null','2021-10-25 00:53:55','2021-10-25 00:53:55',2),(9,'Respeto Peatonal','Manuel','Jesus','Obrador','Los Pinos','12000asa','Ford','10200','Montejo','09/11/2021','null','2021-10-25 00:57:51','2021-10-25 00:57:51',2),(10,'Exceso Velocidad','Los','Nuevos','Formatos','Ahora','Tienen','Jejeje','Nombre','Jaja','09/11/2021','null','2021-10-25 01:02:11','2021-10-25 01:02:11',1),(11,'Alcoholimetro','Jose','Jose','Caamal','Calle 20','10020HYNMCSO0','Nueva','10020','Modelo','09/11/2021','null','2021-10-25 09:57:46','2021-10-25 09:57:46',3),(12,'Alcoholimetro','Pedro','Pedro','Buen Dia','Calle 20','NuevaPlava','Marca Nueva','12080256','Modelo3','09/11/2021','null','2021-10-25 09:59:26','2021-10-25 09:59:26',3),(13,'Respeto Peatonal','Hol','m','mmm','mmmmmsaj','masakjdal','kjdasljdalk','jkaasjdlas','kdasljda','09/11/2021','null','2021-10-25 10:00:19','2021-10-25 10:00:19',2),(14,'Alcoholimetro','Manuel','Lopez','Caamal','Calle 50','Nueva WebShepte','Nuevo','102002','Mitzubichi','09/11/2021','null','2021-10-25 10:03:28','2021-10-25 10:03:28',3),(15,'Alcoholimetro','adjose','caamaldas','joseasd','jcaamalad','jcaamalad','dajcaamal','jcaamalads','majsasasa','09/11/2021','null','2021-10-25 10:11:59','2021-10-25 10:11:59',3),(16,'Alcoholimetro','jose','jose','caamal','calle 20','XYZ-200-200-2AZ','PRINCIPAL','200NSERIES','M','09/11/2021','null','2021-10-25 10:23:25','2021-10-25 10:23:25',3),(17,'Respeto Peatonal','Jose','Caamal','Ic','Calle 20','XYZ-2020-JLCI-2525','Principal','NS2000','Principal','09/11/2021','null','2021-10-25 10:24:34','2021-10-25 10:24:34',2),(18,'Exceso Velocidad','Jose','Luis','Caamal','NuevoDomicilio','NuevaPlava','jjjj','NuevaSerie','jjsnxaksas','09/11/2021','null','2021-10-25 10:27:06','2021-10-25 10:27:06',1),(19,'Respeto Peatonal','Jose','Caamal','Ic','Calle 20','N2005AXXX','MARCANUEVA','10002525','120','09/11/2021','null','2021-10-25 10:30:43','2021-10-25 10:30:43',2),(20,'Respeto Peatonal','Jose Luis','Caamal','Ic','Calle Walllabi 42 Sidney','Nuevo M[exico','Mercedes','12090HYNCMS0','Mercedes','09/11/2021','null','2021-10-25 12:58:55','2021-10-25 12:58:55',2);
/*!40000 ALTER TABLE `tabla_multas_generadas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_propietario`
--

DROP TABLE IF EXISTS `tabla_propietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_propietario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombres` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido_pat` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `apellido_mat` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `sexo` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `edad` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `domicilio` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `lugar` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `marca` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `serie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `age` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `tenencia` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `placas` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `transmision` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created_by` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `updated_by` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_propietario`
--

LOCK TABLES `tabla_propietario` WRITE;
/*!40000 ALTER TABLE `tabla_propietario` DISABLE KEYS */;
INSERT INTO `tabla_propietario` VALUES (1,'Jose','Caamal','Ic','Hombre','20','Merida','Merida','KIA','RIO','21154SDA45DA','2021','NUEVAT','LCJAJSA-000-000-000-00','Manual','24/08/9999','jose','null','2021-10-24 20:37:54','2021-10-24 20:37:54'),(2,'Maria Andrea','Caamal','Ic','Mujer','30','Calle 21','Peto','Mercedes','Benz','1300200','1998','2019','2020','Automatica','24/08/1996','carlos','jose','2021-10-24 22:58:58','2021-10-24 23:02:46');
/*!40000 ALTER TABLE `tabla_propietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_tipo_licencia`
--

DROP TABLE IF EXISTS `tabla_tipo_licencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_tipo_licencia` (
  `id` int NOT NULL AUTO_INCREMENT,
  `concepto_cobro` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `costo` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `created_by` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_tipo_licencia`
--

LOCK TABLES `tabla_tipo_licencia` WRITE;
/*!40000 ALTER TABLE `tabla_tipo_licencia` DISABLE KEYS */;
INSERT INTO `tabla_tipo_licencia` VALUES (1,'Licencia de Tipo A','$1,858.00','jose','2021-10-17 13:42:21','2021-10-17 13:42:21'),(2,'Licencia de Tipo B','$1,748.00','jose','2021-10-17 13:42:21','2021-10-17 13:42:21'),(3,'Licencia de Tipo C','$1,530.00','jose','2021-10-17 13:42:21','2021-10-17 13:42:21'),(4,'Licencia de Tipo D','$1,093.00','jose','2021-10-17 13:42:21','2021-10-17 13:42:21');
/*!40000 ALTER TABLE `tabla_tipo_licencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_usuario`
--

DROP TABLE IF EXISTS `tabla_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_usuario`
--

LOCK TABLES `tabla_usuario` WRITE;
/*!40000 ALTER TABLE `tabla_usuario` DISABLE KEYS */;
INSERT INTO `tabla_usuario` VALUES (1,'jose','jose','jose','1969-12-31 18:00:00','1969-12-31 18:00:00'),(2,'pedro','pedro','pedro','2021-10-17 13:42:21','2021-10-17 13:42:21'),(4,'pepe','pepe','pepe','2021-10-17 15:08:54','2021-10-17 15:08:54'),(5,'carlos','carlos','carlos','2021-10-17 15:09:48','2021-10-17 15:09:48');
/*!40000 ALTER TABLE `tabla_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_vehiculo`
--

DROP TABLE IF EXISTS `tabla_vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_vehiculo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `ano` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `tenencia` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `placas` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `transmision` varchar(45) CHARACTER SET utf8 COLLATE utf8_spanish2_ci DEFAULT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_vehiculo`
--

LOCK TABLES `tabla_vehiculo` WRITE;
/*!40000 ALTER TABLE `tabla_vehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabla_vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-25 13:05:36
