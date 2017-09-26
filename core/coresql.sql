/*
SQLyog Enterprise - MySQL GUI v7.02 
MySQL - 5.0.67-community-nt : Database - rat
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`rat` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `rat`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `cid` int(5) NOT NULL,
  `cname` char(10) NOT NULL,
  `fee` int(5) NOT NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `course` */

insert  into `course`(`cid`,`cname`,`fee`) values (11,'core',11211),(12,'advjava',111),(13,'admin1',1),(14,'admin2',1),(15,'admin3',1),(16,'ssp',1),(17,'jambo',11);

/*Table structure for table `dou` */

DROP TABLE IF EXISTS `dou`;

CREATE TABLE `dou` (
  `did` int(5) NOT NULL auto_increment,
  `dname` char(50) NOT NULL,
  `dmat` text NOT NULL,
  `dsol` text,
  `sid` int(5) default NULL,
  PRIMARY KEY  (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `dou` */

insert  into `dou`(`did`,`dname`,`dmat`,`dsol`,`sid`) values (1,'1212','sdfsdf','adsasa',11),(2,'qqsq','qsqsqs','dad',11),(3,'qqsq','qsqsqsedffffffffffffff',NULL,11),(4,'qqsq','adadawdd',NULL,11);

/*Table structure for table `note` */

DROP TABLE IF EXISTS `note`;

CREATE TABLE `note` (
  `nname` char(50) NOT NULL,
  `nmat` text NOT NULL,
  `nid` int(5) NOT NULL auto_increment,
  PRIMARY KEY  (`nid`)
) ENGINE=InnoDB AUTO_INCREMENT=9627017 DEFAULT CHARSET=latin1;

/*Data for the table `note` */

insert  into `note`(`nname`,`nmat`,`nid`) values ('a','Dear Students,',9627011),('b','Dear Students,',9627012),('b','Dear Students,',9627013),('b','Dear Students,',9627014),('','Dear Students,',9627015),('','Dear Students,',9627016);

/*Table structure for table `stu` */

DROP TABLE IF EXISTS `stu`;

CREATE TABLE `stu` (
  `sid` char(5) NOT NULL,
  `sname` char(10) NOT NULL,
  `emailid` char(20) NOT NULL,
  `mob` char(10) NOT NULL,
  `collage` char(10) default NULL,
  `cid` int(5) NOT NULL,
  `fee` int(1) NOT NULL,
  `pass` char(10) NOT NULL,
  PRIMARY KEY  (`sid`,`mob`),
  UNIQUE KEY `sid` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stu` */

insert  into `stu`(`sid`,`sname`,`emailid`,`mob`,`collage`,`cid`,`fee`,`pass`) values ('11','11','you@you.com','11111','rat',11,1,'yourpass'),('111','jain','you@you.com','11111','rat',12,2,'yourpass'),('20','jain','you@you.com','11111','rat',11,1,'yourpass'),('21','prince','qqqqqqq','1111222212','qqqq',11,1,'qwqw'),('22','princee','prince@gmail.com','11223','skitt',11,1,'prince'),('24','jain','yoyoyoy','11111','skit',0,1,'yourpass'),('25','jain','yoyoyoy','11111','skit',0,1,'yourpass'),('26','prince','you@you.com','11111','rat',0,1,'yourpass'),('28','jain','you@you.com','11111','rat',12,1,'yourpass');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
