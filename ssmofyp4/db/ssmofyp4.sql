-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmofyp4
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssmofyp4`
--

/*!40000 DROP DATABASE IF EXISTS `ssmofyp4`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssmofyp4` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssmofyp4`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `address` varchar(200) NOT NULL COMMENT 'Address',
  `name` varchar(200) NOT NULL COMMENT 'Customer',
  `phone` varchar(200) NOT NULL COMMENT 'Contact',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认Address[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='Address';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2023-02-02 09:15:03',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2023-02-02 09:15:03',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2023-02-02 09:15:03',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2023-02-02 09:15:03',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2023-02-02 09:15:03',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2023-02-02 09:15:03',16,'宇宙银河系月球1号','月某','13823888886','是'),(7,'2023-02-02 09:15:03',17,'宇宙银河系黑洞1号','黑某','13823888887','是'),(8,'2023-02-02 09:15:03',18,'宇宙银河系地球1号','地某','13823888888','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banzhu`
--

DROP TABLE IF EXISTS `banzhu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banzhu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `banzhuzhanghao` varchar(200) DEFAULT NULL COMMENT 'Account',
  `mima` varchar(200) DEFAULT NULL COMMENT 'Password',
  `banzhuxingming` varchar(200) DEFAULT NULL COMMENT 'Name',
  `touxiang` longtext COMMENT 'Image',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT 'Telephone',
  `chuangjianshijian` datetime DEFAULT NULL COMMENT 'Time',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='Moderator';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banzhu`
--

LOCK TABLES `banzhu` WRITE;
/*!40000 ALTER TABLE `banzhu` DISABLE KEYS */;
INSERT INTO `banzhu` VALUES (21,'2023-02-02 09:15:03','Account1','123456','Name1','upload/banzhu_touxiang1.jpg','13823888881','2023-02-02 17:15:03',200),(22,'2023-02-02 09:15:03','Account2','123456','Name2','upload/banzhu_touxiang2.jpg','13823888882','2023-02-02 17:15:03',200),(23,'2023-02-02 09:15:03','Account3','123456','Name3','upload/banzhu_touxiang3.jpg','13823888883','2023-02-02 17:15:03',200),(24,'2023-02-02 09:15:03','Account4','123456','Name4','upload/banzhu_touxiang4.jpg','13823888884','2023-02-02 17:15:03',200),(25,'2023-02-02 09:15:03','Account5','123456','Name5','upload/banzhu_touxiang5.jpg','13823888885','2023-02-02 17:15:03',200),(26,'2023-02-02 09:15:03','Account6','123456','Name6','upload/banzhu_touxiang6.jpg','13823888886','2023-02-02 17:15:03',200),(27,'2023-02-02 09:15:03','Account7','123456','Name7','upload/banzhu_touxiang7.jpg','13823888887','2023-02-02 17:15:03',200),(28,'2023-02-02 09:15:03','Account8','123456','Name8','upload/banzhu_touxiang8.jpg','13823888888','2023-02-02 17:15:03',200);
/*!40000 ALTER TABLE `banzhu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banzhushenqing`
--

DROP TABLE IF EXISTS `banzhushenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banzhushenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT 'Account',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT 'Name',
  `touxiang` longtext COMMENT 'Image',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT 'Telephone',
  `xihuanqiuxing` varchar(200) DEFAULT NULL COMMENT 'Favorite Star',
  `xihuanqiudui` varchar(200) DEFAULT NULL COMMENT 'Favorite Team',
  `gerenjieshao` longtext COMMENT '个人介绍',
  `shenqingliyou` longtext COMMENT '申请理由',
  `shenqingshijian` datetime DEFAULT NULL COMMENT 'Time',
  `sfsh` varchar(200) DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COMMENT 'Reply',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8 COMMENT='Moderator application';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banzhushenqing`
--

LOCK TABLES `banzhushenqing` WRITE;
/*!40000 ALTER TABLE `banzhushenqing` DISABLE KEYS */;
INSERT INTO `banzhushenqing` VALUES (131,'2023-02-02 09:15:03','Account1','Name1','upload/banzhushenqing_touxiang1.jpg,upload/banzhushenqing_touxiang2.jpg,upload/banzhushenqing_touxiang3.jpg','13823888881','Favorite Star1','Favorite Team1','个人介绍1','申请理由1','2023-02-02 17:15:03','是',''),(132,'2023-02-02 09:15:03','Account2','Name2','upload/banzhushenqing_touxiang2.jpg,upload/banzhushenqing_touxiang3.jpg,upload/banzhushenqing_touxiang4.jpg','13823888882','Favorite Star2','Favorite Team2','个人介绍2','申请理由2','2023-02-02 17:15:03','是',''),(133,'2023-02-02 09:15:03','Account3','Name3','upload/banzhushenqing_touxiang3.jpg,upload/banzhushenqing_touxiang4.jpg,upload/banzhushenqing_touxiang5.jpg','13823888883','Favorite Star3','Favorite Team3','个人介绍3','申请理由3','2023-02-02 17:15:03','是',''),(134,'2023-02-02 09:15:03','Account4','Name4','upload/banzhushenqing_touxiang4.jpg,upload/banzhushenqing_touxiang5.jpg,upload/banzhushenqing_touxiang6.jpg','13823888884','Favorite Star4','Favorite Team4','个人介绍4','申请理由4','2023-02-02 17:15:03','是',''),(135,'2023-02-02 09:15:03','Account5','Name5','upload/banzhushenqing_touxiang5.jpg,upload/banzhushenqing_touxiang6.jpg,upload/banzhushenqing_touxiang7.jpg','13823888885','Favorite Star5','Favorite Team5','个人介绍5','申请理由5','2023-02-02 17:15:03','是',''),(136,'2023-02-02 09:15:03','Account6','Name6','upload/banzhushenqing_touxiang6.jpg,upload/banzhushenqing_touxiang7.jpg,upload/banzhushenqing_touxiang8.jpg','13823888886','Favorite Star6','Favorite Team6','个人介绍6','申请理由6','2023-02-02 17:15:03','是',''),(137,'2023-02-02 09:15:03','Account7','Name7','upload/banzhushenqing_touxiang7.jpg,upload/banzhushenqing_touxiang8.jpg,upload/banzhushenqing_touxiang9.jpg','13823888887','Favorite Star7','Favorite Team7','个人介绍7','申请理由7','2023-02-02 17:15:03','是',''),(138,'2023-02-02 09:15:03','Account8','Name8','upload/banzhushenqing_touxiang8.jpg,upload/banzhushenqing_touxiang9.jpg,upload/banzhushenqing_touxiang10.jpg','13823888888','Favorite Star8','Favorite Team8','个人介绍8','申请理由8','2023-02-02 17:15:03','是','');
/*!40000 ALTER TABLE `banzhushenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `tablename` varchar(200) DEFAULT 'zuqiuzhoubian' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT 'Name',
  `picture` longtext COMMENT 'Image',
  `buynumber` int(11) NOT NULL COMMENT 'Number',
  `price` float DEFAULT NULL COMMENT '单价',
  `discountprice` float DEFAULT NULL COMMENT '会员价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='购物车表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussqiuduizhuanqu`
--

DROP TABLE IF EXISTS `discussqiuduizhuanqu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussqiuduizhuanqu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `avatarurl` longtext COMMENT 'Image',
  `nickname` varchar(200) DEFAULT NULL COMMENT 'Username',
  `content` longtext NOT NULL COMMENT '评论Content',
  `reply` longtext COMMENT 'Reply Content',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Teams评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussqiuduizhuanqu`
--

LOCK TABLES `discussqiuduizhuanqu` WRITE;
/*!40000 ALTER TABLE `discussqiuduizhuanqu` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussqiuduizhuanqu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussqiuxingzhuanqu`
--

DROP TABLE IF EXISTS `discussqiuxingzhuanqu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussqiuxingzhuanqu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `avatarurl` longtext COMMENT 'Image',
  `nickname` varchar(200) DEFAULT NULL COMMENT 'Username',
  `content` longtext NOT NULL COMMENT '评论Content',
  `reply` longtext COMMENT 'Reply Content',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Stars评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussqiuxingzhuanqu`
--

LOCK TABLES `discussqiuxingzhuanqu` WRITE;
/*!40000 ALTER TABLE `discussqiuxingzhuanqu` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussqiuxingzhuanqu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusssaishizhibo`
--

DROP TABLE IF EXISTS `discusssaishizhibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusssaishizhibo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `avatarurl` longtext COMMENT 'Image',
  `nickname` varchar(200) DEFAULT NULL COMMENT 'Username',
  `content` longtext NOT NULL COMMENT '评论Content',
  `reply` longtext COMMENT 'Reply Content',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Hot评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusssaishizhibo`
--

LOCK TABLES `discusssaishizhibo` WRITE;
/*!40000 ALTER TABLE `discusssaishizhibo` DISABLE KEYS */;
/*!40000 ALTER TABLE `discusssaishizhibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusszaixianshoupiao`
--

DROP TABLE IF EXISTS `discusszaixianshoupiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusszaixianshoupiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `avatarurl` longtext COMMENT 'Image',
  `nickname` varchar(200) DEFAULT NULL COMMENT 'Username',
  `content` longtext NOT NULL COMMENT '评论Content',
  `reply` longtext COMMENT 'Reply Content',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Online Tickets评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusszaixianshoupiao`
--

LOCK TABLES `discusszaixianshoupiao` WRITE;
/*!40000 ALTER TABLE `discusszaixianshoupiao` DISABLE KEYS */;
/*!40000 ALTER TABLE `discusszaixianshoupiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusszuqiuzhoubian`
--

DROP TABLE IF EXISTS `discusszuqiuzhoubian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusszuqiuzhoubian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `avatarurl` longtext COMMENT 'Image',
  `nickname` varchar(200) DEFAULT NULL COMMENT 'Username',
  `content` longtext NOT NULL COMMENT '评论Content',
  `reply` longtext COMMENT 'Reply Content',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Merchants评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusszuqiuzhoubian`
--

LOCK TABLES `discusszuqiuzhoubian` WRITE;
/*!40000 ALTER TABLE `discusszuqiuzhoubian` DISABLE KEYS */;
/*!40000 ALTER TABLE `discusszuqiuzhoubian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `title` varchar(200) DEFAULT NULL COMMENT 'Post title',
  `content` longtext NOT NULL COMMENT '帖子Content',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `username` varchar(200) DEFAULT NULL COMMENT 'Username',
  `avatarurl` longtext COMMENT 'Image',
  `isdone` varchar(200) DEFAULT NULL COMMENT 'State',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8 COMMENT='Forum';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (141,'2023-02-02 09:15:03','Post title1','帖子Content1',0,1,'Username1','upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg','开放'),(142,'2023-02-02 09:15:03','Post title2','帖子Content2',0,2,'Username2','upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg','开放'),(143,'2023-02-02 09:15:03','Post title3','帖子Content3',0,3,'Username3','upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg','开放'),(144,'2023-02-02 09:15:03','Post title4','帖子Content4',0,4,'Username4','upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg','开放'),(145,'2023-02-02 09:15:03','Post title5','帖子Content5',0,5,'Username5','upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg','开放'),(146,'2023-02-02 09:15:03','Post title6','帖子Content6',0,6,'Username6','upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg','开放'),(147,'2023-02-02 09:15:03','Post title7','帖子Content7',0,7,'Username7','upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg','开放'),(148,'2023-02-02 09:15:03','Post title8','帖子Content8',0,8,'Username8','upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg,upload/forum_avatarurl10.jpg','开放');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiudianxinxi`
--

DROP TABLE IF EXISTS `jiudianxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiudianxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `jiudianmingcheng` varchar(200) NOT NULL COMMENT 'Name',
  `jiudiantupian` longtext COMMENT 'Image',
  `leibie` varchar(200) NOT NULL COMMENT 'Type',
  `xingji` varchar(200) NOT NULL COMMENT 'Star',
  `fangjianleixing` varchar(200) DEFAULT NULL COMMENT 'Room Type',
  `jiudiandizhi` varchar(200) DEFAULT NULL COMMENT 'Address',
  `kefangjiage` float DEFAULT NULL COMMENT 'Room Price',
  `kefangshuliang` int(11) DEFAULT NULL COMMENT 'Remaining',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT 'Contact',
  `jiudianjieshao` longtext COMMENT 'Introduction',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='Hotel Information';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiudianxinxi`
--

LOCK TABLES `jiudianxinxi` WRITE;
/*!40000 ALTER TABLE `jiudianxinxi` DISABLE KEYS */;
INSERT INTO `jiudianxinxi` VALUES (81,'2023-02-02 09:15:03','Name1','upload/jiudianxinxi_jiudiantupian1.jpg,upload/jiudianxinxi_jiudiantupian2.jpg,upload/jiudianxinxi_jiudiantupian3.jpg','Homestay','One','Single room','Address1',1,1,'020-89819991','Introduction1','2023-02-02 17:15:03',1),(82,'2023-02-02 09:15:03','Name2','upload/jiudianxinxi_jiudiantupian2.jpg,upload/jiudianxinxi_jiudiantupian3.jpg,upload/jiudianxinxi_jiudiantupian4.jpg','Homestay','One','Single room','Address2',2,2,'020-89819992','Introduction2','2023-02-02 17:15:03',2),(83,'2023-02-02 09:15:03','Name3','upload/jiudianxinxi_jiudiantupian3.jpg,upload/jiudianxinxi_jiudiantupian4.jpg,upload/jiudianxinxi_jiudiantupian5.jpg','Homestay','One','Single room','Address3',3,3,'020-89819993','Introduction3','2023-02-02 17:15:03',3),(84,'2023-02-02 09:15:03','Name4','upload/jiudianxinxi_jiudiantupian4.jpg,upload/jiudianxinxi_jiudiantupian5.jpg,upload/jiudianxinxi_jiudiantupian6.jpg','Homestay','One','Single room','Address4',4,4,'020-89819994','Introduction4','2023-02-02 17:15:03',4),(85,'2023-02-02 09:15:03','Name5','upload/jiudianxinxi_jiudiantupian5.jpg,upload/jiudianxinxi_jiudiantupian6.jpg,upload/jiudianxinxi_jiudiantupian7.jpg','Homestay','One','Single room','Address5',5,5,'020-89819995','Introduction5','2023-02-02 17:15:03',5),(86,'2023-02-02 09:15:03','Name6','upload/jiudianxinxi_jiudiantupian6.jpg,upload/jiudianxinxi_jiudiantupian7.jpg,upload/jiudianxinxi_jiudiantupian8.jpg','Homestay','One','Single room','Address6',6,6,'020-89819996','Introduction6','2023-02-02 17:15:03',6),(87,'2023-02-02 09:15:03','Name7','upload/jiudianxinxi_jiudiantupian7.jpg,upload/jiudianxinxi_jiudiantupian8.jpg,upload/jiudianxinxi_jiudiantupian9.jpg','Homestay','One','Single room','Address7',7,7,'020-89819997','Introduction7','2023-02-02 17:15:03',7),(88,'2023-02-02 09:15:03','Name8','upload/jiudianxinxi_jiudiantupian8.jpg,upload/jiudianxinxi_jiudiantupian9.jpg,upload/jiudianxinxi_jiudiantupian10.jpg','Homestay','One','Single room','Address8',8,8,'020-89819998','Introduction8','2023-02-02 17:15:03',8);
/*!40000 ALTER TABLE `jiudianxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiudianyuding`
--

DROP TABLE IF EXISTS `jiudianyuding`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiudianyuding` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `yudingdanhao` varchar(200) DEFAULT NULL COMMENT 'ID',
  `jiudianmingcheng` varchar(200) DEFAULT NULL COMMENT 'Name',
  `jiudiantupian` longtext COMMENT 'Image',
  `kefangjiage` int(11) DEFAULT NULL COMMENT 'Room Price',
  `kefangshuliang` int(11) NOT NULL COMMENT 'Remaining',
  `ruzhutianshu` int(11) DEFAULT NULL COMMENT 'Days',
  `zongjine` float DEFAULT NULL COMMENT 'Total Cost',
  `yuyueshijian` datetime DEFAULT NULL COMMENT 'Time',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT 'Account',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT 'Name',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT 'Telephone',
  `ispay` varchar(200) DEFAULT 'Paid' COMMENT 'Paid？',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yudingdanhao` (`yudingdanhao`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='Hotel Order';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiudianyuding`
--

LOCK TABLES `jiudianyuding` WRITE;
/*!40000 ALTER TABLE `jiudianyuding` DISABLE KEYS */;
INSERT INTO `jiudianyuding` VALUES (91,'2023-02-02 09:15:03','1111111111','Name1','upload/jiudianyuding_jiudiantupian1.jpg,upload/jiudianyuding_jiudiantupian2.jpg,upload/jiudianyuding_jiudiantupian3.jpg',1,1,1,1,'2023-02-02 17:15:03','Account1','Name1','13823888881','Paid'),(92,'2023-02-02 09:15:03','2222222222','Name2','upload/jiudianyuding_jiudiantupian2.jpg,upload/jiudianyuding_jiudiantupian3.jpg,upload/jiudianyuding_jiudiantupian4.jpg',2,2,2,2,'2023-02-02 17:15:03','Account2','Name2','13823888882','Paid'),(93,'2023-02-02 09:15:03','3333333333','Name3','upload/jiudianyuding_jiudiantupian3.jpg,upload/jiudianyuding_jiudiantupian4.jpg,upload/jiudianyuding_jiudiantupian5.jpg',3,3,3,3,'2023-02-02 17:15:03','Account3','Name3','13823888883','Paid'),(94,'2023-02-02 09:15:03','4444444444','Name4','upload/jiudianyuding_jiudiantupian4.jpg,upload/jiudianyuding_jiudiantupian5.jpg,upload/jiudianyuding_jiudiantupian6.jpg',4,4,4,4,'2023-02-02 17:15:03','Account4','Name4','13823888884','Paid'),(95,'2023-02-02 09:15:03','5555555555','Name5','upload/jiudianyuding_jiudiantupian5.jpg,upload/jiudianyuding_jiudiantupian6.jpg,upload/jiudianyuding_jiudiantupian7.jpg',5,5,5,5,'2023-02-02 17:15:03','Account5','Name5','13823888885','Paid'),(96,'2023-02-02 09:15:03','6666666666','Name6','upload/jiudianyuding_jiudiantupian6.jpg,upload/jiudianyuding_jiudiantupian7.jpg,upload/jiudianyuding_jiudiantupian8.jpg',6,6,6,6,'2023-02-02 17:15:03','Account6','Name6','13823888886','Paid'),(97,'2023-02-02 09:15:03','7777777777','Name7','upload/jiudianyuding_jiudiantupian7.jpg,upload/jiudianyuding_jiudiantupian8.jpg,upload/jiudianyuding_jiudiantupian9.jpg',7,7,7,7,'2023-02-02 17:15:03','Account7','Name7','13823888887','Paid'),(98,'2023-02-02 09:15:03','8888888888','Name8','upload/jiudianyuding_jiudiantupian8.jpg,upload/jiudianyuding_jiudiantupian9.jpg,upload/jiudianyuding_jiudiantupian10.jpg',8,8,8,8,'2023-02-02 17:15:03','Account8','Name8','13823888888','Paid');
/*!40000 ALTER TABLE `jiudianyuding` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menpiaoyuding`
--

DROP TABLE IF EXISTS `menpiaoyuding`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menpiaoyuding` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `dingdanbianhao` varchar(200) DEFAULT NULL COMMENT 'Order Id',
  `jingdianmingcheng` varchar(200) DEFAULT NULL COMMENT 'Name',
  `tupian` longtext COMMENT 'Image',
  `jingdianleixing` varchar(200) DEFAULT NULL COMMENT 'Type',
  `menpiaojiage` float DEFAULT NULL COMMENT 'Tickets Price',
  `shuliang` int(11) NOT NULL COMMENT 'Number',
  `zongjine` float DEFAULT NULL COMMENT 'Total Cost',
  `goupiaoshijian` datetime DEFAULT NULL COMMENT 'Time',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT 'Account',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT 'Name',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT 'Telephone',
  `ispay` varchar(200) DEFAULT 'Paid' COMMENT 'Paid？',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dingdanbianhao` (`dingdanbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='Tickets Order';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menpiaoyuding`
--

LOCK TABLES `menpiaoyuding` WRITE;
/*!40000 ALTER TABLE `menpiaoyuding` DISABLE KEYS */;
INSERT INTO `menpiaoyuding` VALUES (121,'2023-02-02 09:15:03','1111111111','Name1','upload/menpiaoyuding_tupian1.jpg,upload/menpiaoyuding_tupian2.jpg,upload/menpiaoyuding_tupian3.jpg','Type1',1,1,1,'2023-02-02 17:15:03','Account1','Name1','13823888881','Paid'),(122,'2023-02-02 09:15:03','2222222222','Name2','upload/menpiaoyuding_tupian2.jpg,upload/menpiaoyuding_tupian3.jpg,upload/menpiaoyuding_tupian4.jpg','Type2',2,2,2,'2023-02-02 17:15:03','Account2','Name2','13823888882','Paid'),(123,'2023-02-02 09:15:03','3333333333','Name3','upload/menpiaoyuding_tupian3.jpg,upload/menpiaoyuding_tupian4.jpg,upload/menpiaoyuding_tupian5.jpg','Type3',3,3,3,'2023-02-02 17:15:03','Account3','Name3','13823888883','Paid'),(124,'2023-02-02 09:15:03','4444444444','Name4','upload/menpiaoyuding_tupian4.jpg,upload/menpiaoyuding_tupian5.jpg,upload/menpiaoyuding_tupian6.jpg','Type4',4,4,4,'2023-02-02 17:15:03','Account4','Name4','13823888884','Paid'),(125,'2023-02-02 09:15:03','5555555555','Name5','upload/menpiaoyuding_tupian5.jpg,upload/menpiaoyuding_tupian6.jpg,upload/menpiaoyuding_tupian7.jpg','Type5',5,5,5,'2023-02-02 17:15:03','Account5','Name5','13823888885','Paid'),(126,'2023-02-02 09:15:03','6666666666','Name6','upload/menpiaoyuding_tupian6.jpg,upload/menpiaoyuding_tupian7.jpg,upload/menpiaoyuding_tupian8.jpg','Type6',6,6,6,'2023-02-02 17:15:03','Account6','Name6','13823888886','Paid'),(127,'2023-02-02 09:15:03','7777777777','Name7','upload/menpiaoyuding_tupian7.jpg,upload/menpiaoyuding_tupian8.jpg,upload/menpiaoyuding_tupian9.jpg','Type7',7,7,7,'2023-02-02 17:15:03','Account7','Name7','13823888887','Paid'),(128,'2023-02-02 09:15:03','8888888888','Name8','upload/menpiaoyuding_tupian8.jpg,upload/menpiaoyuding_tupian9.jpg,upload/menpiaoyuding_tupian10.jpg','Type8',8,8,8,'2023-02-02 17:15:03','Account8','Name8','13823888888','Paid');
/*!40000 ALTER TABLE `menpiaoyuding` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT 'Username',
  `avatarurl` longtext COMMENT 'Image',
  `content` longtext NOT NULL COMMENT 'Content',
  `cpicture` longtext COMMENT 'Image',
  `reply` longtext COMMENT 'Reply Content',
  `rpicture` longtext COMMENT 'Reply Image',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=209 DEFAULT CHARSET=utf8 COMMENT='Suggestion';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (201,'2023-02-02 09:15:03',1,'Username1','upload/messages_avatarurl1.jpg','Content1','upload/messages_cpicture1.jpg','Reply Content1','upload/messages_rpicture1.jpg'),(202,'2023-02-02 09:15:03',2,'Username2','upload/messages_avatarurl2.jpg','Content2','upload/messages_cpicture2.jpg','Reply Content2','upload/messages_rpicture2.jpg'),(203,'2023-02-02 09:15:03',3,'Username3','upload/messages_avatarurl3.jpg','Content3','upload/messages_cpicture3.jpg','Reply Content3','upload/messages_rpicture3.jpg'),(204,'2023-02-02 09:15:03',4,'Username4','upload/messages_avatarurl4.jpg','Content4','upload/messages_cpicture4.jpg','Reply Content4','upload/messages_rpicture4.jpg'),(205,'2023-02-02 09:15:03',5,'Username5','upload/messages_avatarurl5.jpg','Content5','upload/messages_cpicture5.jpg','Reply Content5','upload/messages_rpicture5.jpg'),(206,'2023-02-02 09:15:03',6,'Username6','upload/messages_avatarurl6.jpg','Content6','upload/messages_cpicture6.jpg','Reply Content6','upload/messages_rpicture6.jpg'),(207,'2023-02-02 09:15:03',7,'Username7','upload/messages_avatarurl7.jpg','Content7','upload/messages_cpicture7.jpg','Reply Content7','upload/messages_rpicture7.jpg'),(208,'2023-02-02 09:15:03',8,'Username8','upload/messages_avatarurl8.jpg','Content8','upload/messages_cpicture8.jpg','Reply Content8','upload/messages_rpicture8.jpg');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `title` varchar(200) NOT NULL COMMENT 'Title',
  `introduction` longtext COMMENT 'Brief Introduction',
  `picture` longtext NOT NULL COMMENT 'Image',
  `content` longtext NOT NULL COMMENT 'Content',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=199 DEFAULT CHARSET=utf8 COMMENT='Football News';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (191,'2023-02-02 09:15:03','有梦想，就要努力去实现','不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。','upload/news_picture1.jpg','<p>不管你想要怎样的生活，你都要去努力争取，不多尝试一些事情怎么知道自己适合什么、不适合什么呢?</p><p>你说你喜欢读书，让我给你列书单，你还问我哪里有那么多时间看书;你说自己梦想的职业是广告文案，问我如何成为一个文案，应该具备哪些素质;你说你计划晨跑，但总是因为学习、工作辛苦或者身体不舒服第二天起不了床;你说你一直梦想一个人去长途旅行，但是没钱，父母觉得危险。其实，我已经厌倦了你这样说说而已的把戏，我觉得就算我告诉你如何去做，你也不会照做，因为你根本什么都不做。</p><p>真正有行动力的人不需要别人告诉他如何做，因为他已经在做了。就算碰到问题，他也会自己想办法，自己动手去解决或者主动寻求可以帮助他的人，而不是等着别人为自己解决问题。</p><p>首先要学习独立思考。花一点时间想一下自己喜欢什么，梦想是什么，不要别人说想环游世界，你就说你的梦想是环游世界。</p><p>很多人说现实束缚了自己，其实在这个世界上，我们一直都可以有很多选择，生活的决定权也—直都在自己手上，只是我们缺乏行动力而已。</p><p>如果你觉得安于现状是你想要的，那选择安于现状就会让你幸福和满足;如果你不甘平庸，选择一条改变、进取和奋斗的道路，在这个追求的过程中，你也一样会感到快乐。所谓的成功，即是按照自己想要的生活方式生活。最糟糕的State，莫过于当你想要选择一条不甘平庸、改变、进取和奋斗的道路时，却以一种安于现状的方式生活，最后抱怨自己没有得到想要的人生。</p><p>因为喜欢，你不是在苦苦坚持，也因为喜欢，你愿意投入时间、精力，长久以往，获得成功就是自然而然的事情。</p>'),(192,'2023-02-02 09:15:03','又是一年毕业季','又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。','upload/news_picture2.jpg','<p>又是一年毕业季，感慨万千，还记的自己刚进学校那时候的情景，我拖着沉重的行李箱站在偌大的教学楼前面，感叹自己未来的日子即将在这个陌生的校园里度过，而如今斗转星移，浮光掠影，弹指之间，那些青葱岁月如同白驹过隙般悄然从指缝溜走。</p><p>过去的种种在胸口交集纠结，像打翻的五味瓶，甜蜜，酸楚，苦涩，一并涌上心头。一直都是晚会的忠实参与者，无论是台前还是幕后，忽然间，角色转变，那种感觉确实难以用语言表达。</p><p>	过去的三年，总是默默地期盼着这个好雨时节，因为这时候，会有灿烂的阳光，会有满目的百花争艳，会有香甜的冰激凌，这是个毕业的季节，当时不经世事的我们会殷切地期待学校那一大堆的活动，期待穿上绚丽的演出服或者礼仪服，站在大礼堂镁光灯下尽情挥洒我们的澎拜的激情。</p><p>百感交集，隔岸观火与身临其境的感觉竟是如此不同。从来没想过一场晚会送走的是我们自己的时候会是怎样的感情，毕业就真的意味着结束吗?倔强的我们不愿意承认，谢谢学弟学妹们慷慨的将这次的主题定为“我们在这里”。我知道，这可能是他们对我们这些过来人的尊敬和施舍。</p><p>没有为这场晚会排练、奔波，没有为班级、学生会、文学院出点力，还真有点不习惯，百般无奈中，用“工作忙”个万能的借口来搪塞自己，欺骗别人。其实自己心里明白，那只是在逃避，只是不愿面对繁华落幕后的萧条和落寞。大四了，大家各奔东西，想凑齐班上的人真的是难上加难，敏燕从越南回来，刚落地就匆匆回了学校，那么恋家的人也启程回来了，睿睿学姐也是从家赶来跟我们团圆。大家—如既往的寒暄、打趣、调侃对方，似乎一切又回到了当初的单纯美好。</p><p>看着舞台上活泼可爱的学弟学妹们，如同一群机灵的小精灵，清澈的眼神，稚嫩的肢体，轻快地步伐，用他们那热情洋溢的舞姿渲染着在场的每一个人，我知道，我不应该羡慕嫉妒他们，不应该顾自怜惜逝去的青春，不应该感叹夕阳无限好，曾经，我们也拥有过，曾经，我们也年轻过，曾经，我们也灿烂过。我深深地告诉自己，人生的每个阶段都是美的，年轻有年轻的活力，成熟也有成熟的魅力。多—份稳重、淡然、优雅，也是漫漫时光掠影遗留下的.珍贵赏赐。</p>'),(193,'2023-02-02 09:15:03','挫折路上，坚持常在心间','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture3.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>'),(194,'2023-02-02 09:15:03','挫折是另一个生命的开端','当遇到挫折或失败，你是看见失败还是看见机会?挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。','upload/news_picture4.jpg','<p>当遇到挫折或失败，你是看见失败还是看见机会?</p><p>挫折是我们每个人成长的必经之路，它不是你想有就有，想没有就没有的。有句名言说的好，如果你想一生摆脱苦难，你就得是神或者是死尸。这句话形象地说明了挫折是伴随着人生的，是谁都逃不掉的。</p><p>人生在世，从古到今，不分天子平民，机遇虽有不同，但总不免有身陷困境或遭遇难题之处，这时候唯有通权达变，才能使人转危为安，甚To反败为胜。</p><p>大部分的人，一生当中，最痛苦的经验是失去所爱的人，其次是丢掉一份工作。其实，经得起考验的人，就算是被开除也不会惊慌，要学会面对。</p><p>	“塞翁失马，焉知非福。”人生的道路，并不是每一步都迈向成功，这就是追求的意义。我们还要认识到一点，挫折作为一种情绪State和一种个人体验，各人的耐受性是大不相同的，有的人经历了一次次挫折，就能够坚忍不拔，百折不挠;有的人稍遇挫折便意志消沉，一蹶不振。所以，挫折感是一种主观感受，因为人的目的和需要不同，成功标准不同，所以同一种活动对于不同的人可能会造成不同的挫折感受。</p><p>凡事皆以平常心来看待，对于生命顺逆不要太执著。能够“破我执”是很高层的人生境界。</p><p>人事的艰难就是一种考验。就像—支剑要有磨刀来磨，剑才会利:一块璞玉要有粗石来磨，才会发出耀眼的光芒。我们能够做到的，只是如何减少、避免那些由于自身的原因所造成的挫折，而在遇到痛苦和挫折之后，则力求化解痛苦，争取幸福。我们要知道，痛苦和挫折是双重性的，它既是我们人生中难以完全避免的，也是我们在争取成功时，不可缺少的一种动力。因为我认为，推动我们奋斗的力量，不仅仅是对成功的渴望，还有为摆脱痛苦和挫折而进行的奋斗。</p>'),(195,'2023-02-02 09:15:03','你要去相信，没有到不了的明天','有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。','upload/news_picture5.jpg','<p>有梦想就去努力，因为在这一辈子里面，现在不去勇敢的努力，也许就再也没有机会了。你要去相信，一定要相信，没有到不了的明天。不要被命运打败，让自己变得更强大。</p><p>不管你现在是一个人走在异乡的街道上始终没有找到一丝归属感，还是你在跟朋友们一起吃饭开心址笑着的时候闪过一丝落寞。</p><p>	不管你现在是在图书馆里背着怎么也看不进去的英语单词，还是你现在迷茫地看不清未来的方向不知道要往哪走。</p><p>不管你现在是在努力着去实现梦想却没能拉近与梦想的距离，还是你已经慢慢地找不到自己的梦想了。</p><p>你都要去相信，没有到不了的明天。</p><p>	有的时候你的梦想太大，别人说你的梦想根本不可能实现;有的时候你的梦想又太小，又有人说你胸无大志;有的时候你对死党说着将来要去环游世界的梦想，却换来他的不屑一顾，于是你再也不提自己的梦想;有的时候你突然说起将来要开个小店的愿望，却发现你讲述的那个人，并没有听到你在说什么。</p><p>不过又能怎么样呢，未来始终是自己的，梦想始终是自己的，没有人会来帮你实现它。</p><p>也许很多时候我们只是需要朋友的一句鼓励，一句安慰，却也得不到。但是相信我，世界上还有很多人，只是想要和你说说话。</p><p>因为我们都一样。一样的被人说成固执，一样的在追逐他们眼里根本不在意的东西。</p><p>所以，又有什么关系呢，别人始终不是你、不能懂你的心情，你又何必多去解释呢。这个世界会来阻止你，困难也会接踵而To，其实真正关键的只有自己，有没有那个倔强。</p><p>这个世界上没有不带伤的人，真正能治愈自己的，只有自己。</p>'),(196,'2023-02-02 09:15:03','离开是一种痛苦，是一种勇气，但同样也是一个考验，是一个新的开端','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture6.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够Confirm自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>'),(197,'2023-02-02 09:15:03','Leave未必是一种痛苦','无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。','upload/news_picture7.jpg','<p>无穷无尽是离愁，天涯海角遍寻思。当离别在即之时，当面对着相濡以沫兄弟般的朋友时，当面对着经历了四年的磨合而形成的真挚友谊之时，我内心激动无语，说一声再见，道一声珍重都很难出口。回想自己四年大学的风风雨雨，回想我们曾经共同经历的岁月流年，我感谢大家的相扶相依，感谢朋友们的莫大支持与帮助。虽然舍不得，但离别的脚步却不因我们的挚情而停滞。离别的确是一种痛苦，但同样也是我们走入社会，走向新环境、新领域的一个开端，希望大家在以后新的工作岗位上能够Confirm自己的新起点，坚持不懈，向着更新、更高的目标前进，因为人生最美好的东西永远都在最前方!</p><p>忆往昔峥嵘岁月，看今朝潮起潮落，望未来任重而道远。作为新时代的我们，就应在失败时，能拼搏奋起，去谱写人生的辉煌。在成功时，亦能居安思危，不沉湎于一时的荣耀、鲜花和掌声中，时时刻刻怀着一颗积极寻找自己新的奶酪的心，处变不惊、成败不渝，始终踏着自己坚实的步伐，从零开始，不断向前迈进，这样才能在这风起云涌、变幻莫测的社会大潮中成为真正的弄潮儿!</p>'),(198,'2023-02-02 09:15:03','坚持才会成功','回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。','upload/news_picture8.jpg','<p>回头看看，你会不会发现，曾经的你在这里摔倒过;回头看看，你是否发现，一次次地重复着，却从没爬起过。而如今，让我们把视线转向前方，那一道道金色的弧线，是流星飞逝的痕迹，或是成功运行的轨道。今天的你，是否要扬帆起航，让幸福来敲门?</p><p>清晨的太阳撒向大地，神奇的宇宙赋予它神奇的色彩，大自然沐浴着春光，世界因太阳的照射而精彩，林中百鸟啾啾，河水轻轻流淌，汇成清宁的山间小调。</p><p>是的，面对道途上那无情的嘲讽，面对步伐中那重复的摔跤，面对激流与硬石之间猛烈的碰撞，我们必须选择那富于阴雨，却最终见到彩虹的荆棘路。也许，经历了那暴风雨的洗礼，我们便会变得自信，幸福也随之而来。</p><p>司马迁屡遭羞辱，却依然在狱中撰写《史记》，作为一名史学家，不因王权而极度赞赏，也不因卑微而极度批判，然而他在坚持自己操守的同时，却依然要受统治阶级的阻碍，他似乎无权选择自己的本职。但是，他不顾于此，只是在面对道途的阻隔之时，他依然选择了走下去的信念。终于一部开山巨作《史记》诞生，为后人留下一份馈赠，也许在他完成毕生的杰作之时，他微微地笑了，没有什么比梦想实现更快乐的了......</p><p>	或许正如“长风破浪会有时，直挂云帆济沧海”一般，欣欣然地走向看似深渊的崎岖路，而在一番耕耘之后，便会发现这里另有一番天地。也许这就是困难与快乐的交融。</p><p>也许在形形色色的社会中，我们常能看到一份坚持，一份自信，但这里却还有一类人。这类人在暴风雨来临之际，只会闪躲，从未懂得这也是一种历炼，这何尝不是一份快乐。在阴暗的角落里，总是独自在哭，带着伤愁，看不到一点希望。</p><p>我们不能堕落于此，而要像海燕那般，在苍茫的大海上，高傲地飞翔，任何事物都无法阻挡，任何事都是幸福快乐的。</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `orderid` varchar(200) NOT NULL COMMENT 'Order Id',
  `tablename` varchar(200) DEFAULT 'zuqiuzhoubian' COMMENT '商品表名',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `goodid` bigint(20) NOT NULL COMMENT '商品id',
  `goodname` varchar(200) DEFAULT NULL COMMENT 'Name',
  `picture` longtext COMMENT 'Image',
  `buynumber` int(11) NOT NULL COMMENT 'Number',
  `price` float NOT NULL DEFAULT '0' COMMENT 'Price',
  `discountprice` float DEFAULT '0' COMMENT 'Discount',
  `total` float NOT NULL DEFAULT '0' COMMENT 'Total Price',
  `discounttotal` float DEFAULT '0' COMMENT 'Discount Total Price',
  `type` int(11) DEFAULT '1' COMMENT 'Pay Method',
  `status` varchar(200) DEFAULT NULL COMMENT 'State',
  `address` varchar(200) DEFAULT NULL COMMENT 'Address',
  `tel` varchar(200) DEFAULT NULL COMMENT 'Contact',
  `consignee` varchar(200) DEFAULT NULL COMMENT 'Customer',
  `remark` varchar(200) DEFAULT NULL COMMENT 'Tips',
  `logistics` longtext COMMENT '物流',
  `groupno` varchar(200) DEFAULT NULL COMMENT 'Group ID',
  PRIMARY KEY (`id`),
  UNIQUE KEY `orderid` (`orderid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiuduizhuanqu`
--

DROP TABLE IF EXISTS `qiuduizhuanqu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiuduizhuanqu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `qiuduimingcheng` varchar(200) DEFAULT NULL COMMENT 'Name',
  `qiuduifengmian` longtext COMMENT 'Cover',
  `jilupian` longtext COMMENT 'Documentary',
  `zhujiaolian` varchar(200) DEFAULT NULL COMMENT 'Head Coach',
  `qiuduizhanji` longtext COMMENT 'Records',
  `jinqisaicheng` longtext COMMENT 'Recent Schedule',
  `qiuyuanmingdan` longtext COMMENT 'List',
  `qiuduilishi` longtext COMMENT 'Team History',
  `gengxinshijian` date DEFAULT NULL COMMENT 'Update time',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='Teams';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiuduizhuanqu`
--

LOCK TABLES `qiuduizhuanqu` WRITE;
/*!40000 ALTER TABLE `qiuduizhuanqu` DISABLE KEYS */;
INSERT INTO `qiuduizhuanqu` VALUES (51,'2023-02-02 09:15:03','Name1','upload/qiuduizhuanqu_qiuduifengmian1.jpg,upload/qiuduizhuanqu_qiuduifengmian2.jpg,upload/qiuduizhuanqu_qiuduifengmian3.jpg','','Head Coach1','Records1','Recent Schedule1','List1','Team History1','2023-02-02',1,1),(52,'2023-02-02 09:15:03','Name2','upload/qiuduizhuanqu_qiuduifengmian2.jpg,upload/qiuduizhuanqu_qiuduifengmian3.jpg,upload/qiuduizhuanqu_qiuduifengmian4.jpg','','Head Coach2','Records2','Recent Schedule2','List2','Team History2','2023-02-02',2,2),(53,'2023-02-02 09:15:03','Name3','upload/qiuduizhuanqu_qiuduifengmian3.jpg,upload/qiuduizhuanqu_qiuduifengmian4.jpg,upload/qiuduizhuanqu_qiuduifengmian5.jpg','','Head Coach3','Records3','Recent Schedule3','List3','Team History3','2023-02-02',3,3),(54,'2023-02-02 09:15:03','Name4','upload/qiuduizhuanqu_qiuduifengmian4.jpg,upload/qiuduizhuanqu_qiuduifengmian5.jpg,upload/qiuduizhuanqu_qiuduifengmian6.jpg','','Head Coach4','Records4','Recent Schedule4','List4','Team History4','2023-02-02',4,4),(55,'2023-02-02 09:15:03','Name5','upload/qiuduizhuanqu_qiuduifengmian5.jpg,upload/qiuduizhuanqu_qiuduifengmian6.jpg,upload/qiuduizhuanqu_qiuduifengmian7.jpg','','Head Coach5','Records5','Recent Schedule5','List5','Team History5','2023-02-02',5,5),(56,'2023-02-02 09:15:03','Name6','upload/qiuduizhuanqu_qiuduifengmian6.jpg,upload/qiuduizhuanqu_qiuduifengmian7.jpg,upload/qiuduizhuanqu_qiuduifengmian8.jpg','','Head Coach6','Records6','Recent Schedule6','List6','Team History6','2023-02-02',6,6),(57,'2023-02-02 09:15:03','Name7','upload/qiuduizhuanqu_qiuduifengmian7.jpg,upload/qiuduizhuanqu_qiuduifengmian8.jpg,upload/qiuduizhuanqu_qiuduifengmian9.jpg','','Head Coach7','Records7','Recent Schedule7','List7','Team History7','2023-02-02',7,7),(58,'2023-02-02 09:15:03','Name8','upload/qiuduizhuanqu_qiuduifengmian8.jpg,upload/qiuduizhuanqu_qiuduifengmian9.jpg,upload/qiuduizhuanqu_qiuduifengmian10.jpg','','Head Coach8','Records8','Recent Schedule8','List8','Team History8','2023-02-02',8,8);
/*!40000 ALTER TABLE `qiuduizhuanqu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qiuxingzhuanqu`
--

DROP TABLE IF EXISTS `qiuxingzhuanqu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qiuxingzhuanqu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `qiuyuanxingming` varchar(200) DEFAULT NULL COMMENT 'Name',
  `touxiang` longtext COMMENT 'Image',
  `gerenjijin` longtext COMMENT 'Highlight',
  `qiuyihaoma` int(11) DEFAULT NULL COMMENT 'Jersey number',
  `qiuchangweizhi` varchar(200) DEFAULT NULL COMMENT 'Position',
  `suoshuqiudui` varchar(200) DEFAULT NULL COMMENT 'Team',
  `shengao` varchar(200) DEFAULT NULL COMMENT 'Height',
  `tizhong` varchar(200) DEFAULT NULL COMMENT 'Weight',
  `shengri` date DEFAULT NULL COMMENT 'Birthday',
  `nianling` int(11) DEFAULT NULL COMMENT 'Age',
  `qiuyuanlvli` longtext COMMENT 'Background',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='Stars';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qiuxingzhuanqu`
--

LOCK TABLES `qiuxingzhuanqu` WRITE;
/*!40000 ALTER TABLE `qiuxingzhuanqu` DISABLE KEYS */;
INSERT INTO `qiuxingzhuanqu` VALUES (61,'2023-02-02 09:15:03','Name1','upload/qiuxingzhuanqu_touxiang1.jpg,upload/qiuxingzhuanqu_touxiang2.jpg,upload/qiuxingzhuanqu_touxiang3.jpg','',1,'Center','Team1','Height1','Weight1','2023-02-02',1,'Background1'),(62,'2023-02-02 09:15:03','Name2','upload/qiuxingzhuanqu_touxiang2.jpg,upload/qiuxingzhuanqu_touxiang3.jpg,upload/qiuxingzhuanqu_touxiang4.jpg','',2,'Center','Team2','Height2','Weight2','2023-02-02',2,'Background2'),(63,'2023-02-02 09:15:03','Name3','upload/qiuxingzhuanqu_touxiang3.jpg,upload/qiuxingzhuanqu_touxiang4.jpg,upload/qiuxingzhuanqu_touxiang5.jpg','',3,'Center','Team3','Height3','Weight3','2023-02-02',3,'Background3'),(64,'2023-02-02 09:15:03','Name4','upload/qiuxingzhuanqu_touxiang4.jpg,upload/qiuxingzhuanqu_touxiang5.jpg,upload/qiuxingzhuanqu_touxiang6.jpg','',4,'Center','Team4','Height4','Weight4','2023-02-02',4,'Background4'),(65,'2023-02-02 09:15:03','Name5','upload/qiuxingzhuanqu_touxiang5.jpg,upload/qiuxingzhuanqu_touxiang6.jpg,upload/qiuxingzhuanqu_touxiang7.jpg','',5,'Center','Team5','Height5','Weight5','2023-02-02',5,'Background5'),(66,'2023-02-02 09:15:03','Name6','upload/qiuxingzhuanqu_touxiang6.jpg,upload/qiuxingzhuanqu_touxiang7.jpg,upload/qiuxingzhuanqu_touxiang8.jpg','',6,'Center','Team6','Height6','Weight6','2023-02-02',6,'Background6'),(67,'2023-02-02 09:15:03','Name7','upload/qiuxingzhuanqu_touxiang7.jpg,upload/qiuxingzhuanqu_touxiang8.jpg,upload/qiuxingzhuanqu_touxiang9.jpg','',7,'Center','Team7','Height7','Weight7','2023-02-02',7,'Background7'),(68,'2023-02-02 09:15:03','Name8','upload/qiuxingzhuanqu_touxiang8.jpg,upload/qiuxingzhuanqu_touxiang9.jpg,upload/qiuxingzhuanqu_touxiang10.jpg','',8,'Center','Team8','Height8','Weight8','2023-02-02',8,'Background8');
/*!40000 ALTER TABLE `qiuxingzhuanqu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `remenjingdian`
--

DROP TABLE IF EXISTS `remenjingdian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `remenjingdian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `jingdianmingcheng` varchar(200) NOT NULL COMMENT 'Name',
  `tupian` longtext COMMENT 'Image',
  `dengji` varchar(200) DEFAULT NULL COMMENT 'Level',
  `jingdianleixing` varchar(200) DEFAULT NULL COMMENT 'Type',
  `kaifangshijian` varchar(200) DEFAULT NULL COMMENT 'Opening Time',
  `menpiaojiage` float NOT NULL COMMENT 'Tickets Price',
  `shuliang` int(11) DEFAULT NULL COMMENT 'Number',
  `jingdianweizhi` varchar(200) DEFAULT NULL COMMENT 'Location',
  `goupiaoxuzhi` longtext COMMENT 'Notice',
  `zhuyishixiang` longtext COMMENT 'Tips',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8 COMMENT='Popular Sites';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `remenjingdian`
--

LOCK TABLES `remenjingdian` WRITE;
/*!40000 ALTER TABLE `remenjingdian` DISABLE KEYS */;
INSERT INTO `remenjingdian` VALUES (111,'2023-02-02 09:15:03','Name1','upload/remenjingdian_tupian1.jpg,upload/remenjingdian_tupian2.jpg,upload/remenjingdian_tupian3.jpg','One','Ancient town','Opening Time1',1,1,'Location1','Notice1','Tips1','2023-02-02 17:15:03',1),(112,'2023-02-02 09:15:03','Name2','upload/remenjingdian_tupian2.jpg,upload/remenjingdian_tupian3.jpg,upload/remenjingdian_tupian4.jpg','One','Ancient town','Opening Time2',2,2,'Location2','Notice2','Tips2','2023-02-02 17:15:03',2),(113,'2023-02-02 09:15:03','Name3','upload/remenjingdian_tupian3.jpg,upload/remenjingdian_tupian4.jpg,upload/remenjingdian_tupian5.jpg','One','Ancient town','Opening Time3',3,3,'Location3','Notice3','Tips3','2023-02-02 17:15:03',3),(114,'2023-02-02 09:15:03','Name4','upload/remenjingdian_tupian4.jpg,upload/remenjingdian_tupian5.jpg,upload/remenjingdian_tupian6.jpg','One','Ancient town','Opening Time4',4,4,'Location4','Notice4','Tips4','2023-02-02 17:15:03',4),(115,'2023-02-02 09:15:03','Name5','upload/remenjingdian_tupian5.jpg,upload/remenjingdian_tupian6.jpg,upload/remenjingdian_tupian7.jpg','One','Ancient town','Opening Time5',5,5,'Location5','Notice5','Tips5','2023-02-02 17:15:03',5),(116,'2023-02-02 09:15:03','Name6','upload/remenjingdian_tupian6.jpg,upload/remenjingdian_tupian7.jpg,upload/remenjingdian_tupian8.jpg','One','Ancient town','Opening Time6',6,6,'Location6','Notice6','Tips6','2023-02-02 17:15:03',6),(117,'2023-02-02 09:15:03','Name7','upload/remenjingdian_tupian7.jpg,upload/remenjingdian_tupian8.jpg,upload/remenjingdian_tupian9.jpg','One','Ancient town','Opening Time7',7,7,'Location7','Notice7','Tips7','2023-02-02 17:15:03',7),(118,'2023-02-02 09:15:03','Name8','upload/remenjingdian_tupian8.jpg,upload/remenjingdian_tupian9.jpg,upload/remenjingdian_tupian10.jpg','One','Ancient town','Opening Time8',8,8,'Location8','Notice8','Tips8','2023-02-02 17:15:03',8);
/*!40000 ALTER TABLE `remenjingdian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saichengxinxi`
--

DROP TABLE IF EXISTS `saichengxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saichengxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `saishimingcheng` varchar(200) DEFAULT NULL COMMENT 'Name',
  `fengmiantupian` longtext COMMENT 'Cover',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT 'State',
  `lunci` varchar(200) DEFAULT NULL COMMENT 'Round',
  `zhudui` varchar(200) DEFAULT NULL COMMENT 'Home',
  `kedui` varchar(200) DEFAULT NULL COMMENT 'Away',
  `saishididian` varchar(200) DEFAULT NULL COMMENT 'Venue',
  `bisaishijian` datetime DEFAULT NULL COMMENT 'Time',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='Schedule info';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saichengxinxi`
--

LOCK TABLES `saichengxinxi` WRITE;
/*!40000 ALTER TABLE `saichengxinxi` DISABLE KEYS */;
INSERT INTO `saichengxinxi` VALUES (31,'2023-02-02 09:15:03','Name1','upload/saichengxinxi_fengmiantupian1.jpg,upload/saichengxinxi_fengmiantupian2.jpg,upload/saichengxinxi_fengmiantupian3.jpg','to be started','Round1','Home1','Away1','Venue1','2023-02-02 17:15:03'),(32,'2023-02-02 09:15:03','Name2','upload/saichengxinxi_fengmiantupian2.jpg,upload/saichengxinxi_fengmiantupian3.jpg,upload/saichengxinxi_fengmiantupian4.jpg','to be started','Round2','Home2','Away2','Venue2','2023-02-02 17:15:03'),(33,'2023-02-02 09:15:03','Name3','upload/saichengxinxi_fengmiantupian3.jpg,upload/saichengxinxi_fengmiantupian4.jpg,upload/saichengxinxi_fengmiantupian5.jpg','to be started','Round3','Home3','Away3','Venue3','2023-02-02 17:15:03'),(34,'2023-02-02 09:15:03','Name4','upload/saichengxinxi_fengmiantupian4.jpg,upload/saichengxinxi_fengmiantupian5.jpg,upload/saichengxinxi_fengmiantupian6.jpg','to be started','Round4','Home4','Away4','Venue4','2023-02-02 17:15:03'),(35,'2023-02-02 09:15:03','Name5','upload/saichengxinxi_fengmiantupian5.jpg,upload/saichengxinxi_fengmiantupian6.jpg,upload/saichengxinxi_fengmiantupian7.jpg','to be started','Round5','Home5','Away5','Venue5','2023-02-02 17:15:03'),(36,'2023-02-02 09:15:03','Name6','upload/saichengxinxi_fengmiantupian6.jpg,upload/saichengxinxi_fengmiantupian7.jpg,upload/saichengxinxi_fengmiantupian8.jpg','to be started','Round6','Home6','Away6','Venue6','2023-02-02 17:15:03'),(37,'2023-02-02 09:15:03','Name7','upload/saichengxinxi_fengmiantupian7.jpg,upload/saichengxinxi_fengmiantupian8.jpg,upload/saichengxinxi_fengmiantupian9.jpg','to be started','Round7','Home7','Away7','Venue7','2023-02-02 17:15:03'),(38,'2023-02-02 09:15:03','Name8','upload/saichengxinxi_fengmiantupian8.jpg,upload/saichengxinxi_fengmiantupian9.jpg,upload/saichengxinxi_fengmiantupian10.jpg','to be started','Round8','Home8','Away8','Venue8','2023-02-02 17:15:03');
/*!40000 ALTER TABLE `saichengxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saishizhibo`
--

DROP TABLE IF EXISTS `saishizhibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saishizhibo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `bisaimingcheng` varchar(200) DEFAULT NULL COMMENT 'Name',
  `bisaitupian` longtext COMMENT 'Image',
  `zhudui` varchar(200) DEFAULT NULL COMMENT 'Home',
  `kedui` varchar(200) DEFAULT NULL COMMENT 'Away',
  `bisaididian` varchar(200) DEFAULT NULL COMMENT 'Venue',
  `bisaishipin` longtext COMMENT 'Vedio',
  `wenzizhibo` varchar(200) DEFAULT NULL COMMENT 'Live link',
  `bisaishijian` datetime DEFAULT NULL COMMENT 'Time',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='Hot';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saishizhibo`
--

LOCK TABLES `saishizhibo` WRITE;
/*!40000 ALTER TABLE `saishizhibo` DISABLE KEYS */;
INSERT INTO `saishizhibo` VALUES (41,'2023-02-02 09:15:03','Name1','upload/saishizhibo_bisaitupian1.jpg,upload/saishizhibo_bisaitupian2.jpg,upload/saishizhibo_bisaitupian3.jpg','Home1','Away1','Venue1','','Live link1','2023-02-02 17:15:03',1,1,'2023-02-02 17:15:03',1),(42,'2023-02-02 09:15:03','Name2','upload/saishizhibo_bisaitupian2.jpg,upload/saishizhibo_bisaitupian3.jpg,upload/saishizhibo_bisaitupian4.jpg','Home2','Away2','Venue2','','Live link2','2023-02-02 17:15:03',2,2,'2023-02-02 17:15:03',2),(43,'2023-02-02 09:15:03','Name3','upload/saishizhibo_bisaitupian3.jpg,upload/saishizhibo_bisaitupian4.jpg,upload/saishizhibo_bisaitupian5.jpg','Home3','Away3','Venue3','','Live link3','2023-02-02 17:15:03',3,3,'2023-02-02 17:15:03',3),(44,'2023-02-02 09:15:03','Name4','upload/saishizhibo_bisaitupian4.jpg,upload/saishizhibo_bisaitupian5.jpg,upload/saishizhibo_bisaitupian6.jpg','Home4','Away4','Venue4','','Live link4','2023-02-02 17:15:03',4,4,'2023-02-02 17:15:03',4),(45,'2023-02-02 09:15:03','Name5','upload/saishizhibo_bisaitupian5.jpg,upload/saishizhibo_bisaitupian6.jpg,upload/saishizhibo_bisaitupian7.jpg','Home5','Away5','Venue5','','Live link5','2023-02-02 17:15:03',5,5,'2023-02-02 17:15:03',5),(46,'2023-02-02 09:15:03','Name6','upload/saishizhibo_bisaitupian6.jpg,upload/saishizhibo_bisaitupian7.jpg,upload/saishizhibo_bisaitupian8.jpg','Home6','Away6','Venue6','','Live link6','2023-02-02 17:15:03',6,6,'2023-02-02 17:15:03',6),(47,'2023-02-02 09:15:03','Name7','upload/saishizhibo_bisaitupian7.jpg,upload/saishizhibo_bisaitupian8.jpg,upload/saishizhibo_bisaitupian9.jpg','Home7','Away7','Venue7','','Live link7','2023-02-02 17:15:03',7,7,'2023-02-02 17:15:03',7),(48,'2023-02-02 09:15:03','Name8','upload/saishizhibo_bisaitupian8.jpg,upload/saishizhibo_bisaitupian9.jpg,upload/saishizhibo_bisaitupian10.jpg','Home8','Away8','Venue8','','Live link8','2023-02-02 17:15:03',8,8,'2023-02-02 17:15:03',8);
/*!40000 ALTER TABLE `saishizhibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT 'Image',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT 'Tips',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT 'Userid',
  `username` varchar(100) NOT NULL COMMENT 'Username',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT 'Password',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Add时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT 'Username',
  `password` varchar(100) NOT NULL COMMENT 'Password',
  `role` varchar(100) DEFAULT 'Administrator' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Add时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='User表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','Administrator','2023-02-02 09:15:03');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT 'Account',
  `mima` varchar(200) NOT NULL COMMENT 'Password',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT 'Name',
  `touxiang` longtext COMMENT 'Image',
  `xingbie` varchar(200) DEFAULT NULL COMMENT 'Gender',
  `nianling` int(11) DEFAULT NULL COMMENT 'Age',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT 'Telephone',
  `money` float DEFAULT '0' COMMENT '余额',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='User';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2023-02-02 09:15:03','Account1','123456','Name1','upload/yonghu_touxiang1.jpg','男',1,'13823888881',200),(12,'2023-02-02 09:15:03','Account2','123456','Name2','upload/yonghu_touxiang2.jpg','男',2,'13823888882',200),(13,'2023-02-02 09:15:03','Account3','123456','Name3','upload/yonghu_touxiang3.jpg','男',3,'13823888883',200),(14,'2023-02-02 09:15:03','Account4','123456','Name4','upload/yonghu_touxiang4.jpg','男',4,'13823888884',200),(15,'2023-02-02 09:15:03','Account5','123456','Name5','upload/yonghu_touxiang5.jpg','男',5,'13823888885',200),(16,'2023-02-02 09:15:03','Account6','123456','Name6','upload/yonghu_touxiang6.jpg','男',6,'13823888886',200),(17,'2023-02-02 09:15:03','Account7','123456','Name7','upload/yonghu_touxiang7.jpg','男',7,'13823888887',200),(18,'2023-02-02 09:15:03','Account8','123456','Name8','upload/yonghu_touxiang8.jpg','男',8,'13823888888',200);
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zaixianshoupiao`
--

DROP TABLE IF EXISTS `zaixianshoupiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zaixianshoupiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `changcibianhao` varchar(200) DEFAULT NULL COMMENT 'ID',
  `qiupiaomingcheng` varchar(200) DEFAULT NULL COMMENT 'Name',
  `fengmian` longtext COMMENT 'Cover',
  `zhuchangqiudui` varchar(200) DEFAULT NULL COMMENT 'Home',
  `kechangqiudui` varchar(200) DEFAULT NULL COMMENT 'Away',
  `bisaididian` varchar(200) DEFAULT NULL COMMENT 'Venue',
  `bisaishijian` datetime DEFAULT NULL COMMENT 'Time',
  `saishijieshao` longtext COMMENT 'Introduction',
  `price` float NOT NULL COMMENT 'Price',
  `number` int(11) DEFAULT NULL COMMENT 'Seats',
  `selected` longtext COMMENT 'Selected',
  PRIMARY KEY (`id`),
  UNIQUE KEY `changcibianhao` (`changcibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='Online Tickets';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zaixianshoupiao`
--

LOCK TABLES `zaixianshoupiao` WRITE;
/*!40000 ALTER TABLE `zaixianshoupiao` DISABLE KEYS */;
INSERT INTO `zaixianshoupiao` VALUES (71,'2023-02-02 09:15:03','1111111111','Name1','upload/zaixianshoupiao_fengmian1.jpg,upload/zaixianshoupiao_fengmian2.jpg,upload/zaixianshoupiao_fengmian3.jpg','Home1','Away1','Venue1','2023-02-02 17:15:03','Introduction1',99.9,20,'1,3,5,7,9'),(72,'2023-02-02 09:15:03','2222222222','Name2','upload/zaixianshoupiao_fengmian2.jpg,upload/zaixianshoupiao_fengmian3.jpg,upload/zaixianshoupiao_fengmian4.jpg','Home2','Away2','Venue2','2023-02-02 17:15:03','Introduction2',99.9,20,'1,3,5,7,9'),(73,'2023-02-02 09:15:03','3333333333','Name3','upload/zaixianshoupiao_fengmian3.jpg,upload/zaixianshoupiao_fengmian4.jpg,upload/zaixianshoupiao_fengmian5.jpg','Home3','Away3','Venue3','2023-02-02 17:15:03','Introduction3',99.9,20,'1,3,5,7,9'),(74,'2023-02-02 09:15:03','4444444444','Name4','upload/zaixianshoupiao_fengmian4.jpg,upload/zaixianshoupiao_fengmian5.jpg,upload/zaixianshoupiao_fengmian6.jpg','Home4','Away4','Venue4','2023-02-02 17:15:03','Introduction4',99.9,20,'1,3,5,7,9'),(75,'2023-02-02 09:15:03','5555555555','Name5','upload/zaixianshoupiao_fengmian5.jpg,upload/zaixianshoupiao_fengmian6.jpg,upload/zaixianshoupiao_fengmian7.jpg','Home5','Away5','Venue5','2023-02-02 17:15:03','Introduction5',99.9,20,'1,3,5,7,9'),(76,'2023-02-02 09:15:03','6666666666','Name6','upload/zaixianshoupiao_fengmian6.jpg,upload/zaixianshoupiao_fengmian7.jpg,upload/zaixianshoupiao_fengmian8.jpg','Home6','Away6','Venue6','2023-02-02 17:15:03','Introduction6',99.9,20,'1,3,5,7,9'),(77,'2023-02-02 09:15:03','7777777777','Name7','upload/zaixianshoupiao_fengmian7.jpg,upload/zaixianshoupiao_fengmian8.jpg,upload/zaixianshoupiao_fengmian9.jpg','Home7','Away7','Venue7','2023-02-02 17:15:03','Introduction7',99.9,20,'1,3,5,7,9'),(78,'2023-02-02 09:15:03','8888888888','Name8','upload/zaixianshoupiao_fengmian8.jpg,upload/zaixianshoupiao_fengmian9.jpg,upload/zaixianshoupiao_fengmian10.jpg','Home8','Away8','Venue8','2023-02-02 17:15:03','Introduction8',99.9,20,'1,3,5,7,9');
/*!40000 ALTER TABLE `zaixianshoupiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuqiuzhoubian`
--

DROP TABLE IF EXISTS `zuqiuzhoubian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuqiuzhoubian` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Time',
  `shangpinbianhao` varchar(200) DEFAULT NULL COMMENT '商品编号',
  `shangpinmingcheng` varchar(200) DEFAULT NULL COMMENT 'Name',
  `shangpinfengmian` longtext COMMENT 'Cover',
  `shangpinfenlei` varchar(200) DEFAULT NULL COMMENT '商品分类',
  `pinpai` varchar(200) DEFAULT NULL COMMENT 'Brand',
  `guige` varchar(200) DEFAULT NULL COMMENT 'Size',
  `chanpinxiangqing` longtext COMMENT 'Details',
  `onelimittimes` int(11) DEFAULT NULL COMMENT 'Limit',
  `alllimittimes` int(11) DEFAULT NULL COMMENT 'Remaining',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `price` float NOT NULL COMMENT 'Price',
  `groupprice` float DEFAULT '0' COMMENT 'Group Price',
  `grouppeople` int(11) DEFAULT '0' COMMENT 'Group number',
  `curpeople` int(11) DEFAULT '0' COMMENT 'Current Number',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shangpinbianhao` (`shangpinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='Merchants';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuqiuzhoubian`
--

LOCK TABLES `zuqiuzhoubian` WRITE;
/*!40000 ALTER TABLE `zuqiuzhoubian` DISABLE KEYS */;
INSERT INTO `zuqiuzhoubian` VALUES (101,'2023-02-02 09:15:03','1111111111','Name1','upload/zuqiuzhoubian_shangpinfengmian1.jpg,upload/zuqiuzhoubian_shangpinfengmian2.jpg,upload/zuqiuzhoubian_shangpinfengmian3.jpg','商品分类1','Brand1','Size1','Details1',1,99,'2023-02-02 17:15:03',1,99.9,9.9,2,0),(102,'2023-02-02 09:15:03','2222222222','Name2','upload/zuqiuzhoubian_shangpinfengmian2.jpg,upload/zuqiuzhoubian_shangpinfengmian3.jpg,upload/zuqiuzhoubian_shangpinfengmian4.jpg','商品分类2','Brand2','Size2','Details2',2,99,'2023-02-02 17:15:03',2,99.9,9.9,2,0),(103,'2023-02-02 09:15:03','3333333333','Name3','upload/zuqiuzhoubian_shangpinfengmian3.jpg,upload/zuqiuzhoubian_shangpinfengmian4.jpg,upload/zuqiuzhoubian_shangpinfengmian5.jpg','商品分类3','Brand3','Size3','Details3',3,99,'2023-02-02 17:15:03',3,99.9,9.9,2,0),(104,'2023-02-02 09:15:03','4444444444','Name4','upload/zuqiuzhoubian_shangpinfengmian4.jpg,upload/zuqiuzhoubian_shangpinfengmian5.jpg,upload/zuqiuzhoubian_shangpinfengmian6.jpg','商品分类4','Brand4','Size4','Details4',4,99,'2023-02-02 17:15:03',4,99.9,9.9,2,0),(105,'2023-02-02 09:15:03','5555555555','Name5','upload/zuqiuzhoubian_shangpinfengmian5.jpg,upload/zuqiuzhoubian_shangpinfengmian6.jpg,upload/zuqiuzhoubian_shangpinfengmian7.jpg','商品分类5','Brand5','Size5','Details5',5,99,'2023-02-02 17:15:03',5,99.9,9.9,2,0),(106,'2023-02-02 09:15:03','6666666666','Name6','upload/zuqiuzhoubian_shangpinfengmian6.jpg,upload/zuqiuzhoubian_shangpinfengmian7.jpg,upload/zuqiuzhoubian_shangpinfengmian8.jpg','商品分类6','Brand6','Size6','Details6',6,99,'2023-02-02 17:15:03',6,99.9,9.9,2,0),(107,'2023-02-02 09:15:03','7777777777','Name7','upload/zuqiuzhoubian_shangpinfengmian7.jpg,upload/zuqiuzhoubian_shangpinfengmian8.jpg,upload/zuqiuzhoubian_shangpinfengmian9.jpg','商品分类7','Brand7','Size7','Details7',7,99,'2023-02-02 17:15:03',7,99.9,9.9,2,0),(108,'2023-02-02 09:15:03','8888888888','Name8','upload/zuqiuzhoubian_shangpinfengmian8.jpg,upload/zuqiuzhoubian_shangpinfengmian9.jpg,upload/zuqiuzhoubian_shangpinfengmian10.jpg','商品分类8','Brand8','Size8','Details8',8,99,'2023-02-02 17:15:03',8,99.9,9.9,2,0);
/*!40000 ALTER TABLE `zuqiuzhoubian` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-02 17:16:30
