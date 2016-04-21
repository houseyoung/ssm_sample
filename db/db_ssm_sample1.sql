/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.18 : Database - db_ssm_sample
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_ssm_sample` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_ssm_sample`;

/*Table structure for table `t_course` */

DROP TABLE IF EXISTS `t_course`;

CREATE TABLE `t_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(32) NOT NULL,
  `course_teachername` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `t_course` */

insert  into `t_course`(`id`,`course_name`,`course_teachername`) values (1,'高等数学','周老师'),(2,'线性代数','吴老师'),(3,'离散数学','郑老师'),(4,'概率论','王老师');

/*Table structure for table `t_group` */

DROP TABLE IF EXISTS `t_group`;

CREATE TABLE `t_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `descripition` varchar(255) NOT NULL DEFAULT '',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_group` */

insert  into `t_group`(`id`,`name`,`descripition`,`created_time`,`last_modified_time`) values (1,'admin','超级管理员','2016-04-18 09:56:24','0000-00-00 00:00:00');

/*Table structure for table `t_group_permission` */

DROP TABLE IF EXISTS `t_group_permission`;

CREATE TABLE `t_group_permission` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL DEFAULT '0',
  `permission_id` varchar(255) NOT NULL,
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_modified_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `t_group_permission` */

insert  into `t_group_permission`(`id`,`group_id`,`permission_id`,`created_time`,`last_modified_time`) values (1,1,'7','2016-04-18 09:57:02','0000-00-00 00:00:00'),(2,1,'8','2016-04-20 08:47:32','0000-00-00 00:00:00'),(3,1,'9','2016-04-20 08:47:34','0000-00-00 00:00:00'),(4,1,'10','2016-04-20 08:47:36','0000-00-00 00:00:00'),(5,1,'11','2016-04-20 08:47:38','0000-00-00 00:00:00');

/*Table structure for table `t_permisssion` */

DROP TABLE IF EXISTS `t_permisssion`;

CREATE TABLE `t_permisssion` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `expression` varchar(255) NOT NULL DEFAULT '',
  `description` varchar(255) NOT NULL DEFAULT '',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `last_modified` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf32;

/*Data for the table `t_permisssion` */

insert  into `t_permisssion`(`id`,`expression`,`description`,`created_time`,`last_modified`) values (1,'Admin','后台管理','2016-04-18 09:58:44','0000-00-00 00:00:00'),(2,'Admin:User','后台管理-用户管理','2016-04-18 09:59:45','0000-00-00 00:00:00'),(3,'Admin:User:Insert','后台管理-用户管理-用户添加','2016-04-18 10:00:11','0000-00-00 00:00:00'),(4,'Admin:User:Delete','后台管理-用户管理-用户删除','2016-04-18 10:00:31','0000-00-00 00:00:00'),(5,'Admin:User:Update','后台管理-用户管理-用户修改','2016-04-18 10:01:22','0000-00-00 00:00:00'),(6,'Admin:User:View','后台管理-用户管理-用户查看','2016-04-18 10:01:44','0000-00-00 00:00:00'),(7,'Admin:Student','后台管理-学生管理','2016-04-19 16:30:50','0000-00-00 00:00:00'),(8,'Admin:Student:Insert','后台管理-学生管理','2016-04-19 16:54:01','0000-00-00 00:00:00'),(9,'Admin:Student:Delete','后台管理-学生管理','2016-04-19 16:54:08','0000-00-00 00:00:00'),(10,'Admin:Student:Update','后台管理-学生管理','2016-04-19 16:54:48','0000-00-00 00:00:00'),(11,'Admin:Student:View','后台管理-学生管理','2016-04-19 16:54:32','0000-00-00 00:00:00');

/*Table structure for table `t_score` */

DROP TABLE IF EXISTS `t_score`;

CREATE TABLE `t_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `score` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

/*Data for the table `t_score` */

insert  into `t_score`(`id`,`score`,`student_id`,`course_id`) values (1,99,2011012488,1),(14,88,2011012001,3),(16,77,2011012488,3),(17,88,2011012488,4);

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(32) NOT NULL,
  `student_name` varchar(32) NOT NULL,
  `student_sex` varchar(2) DEFAULT NULL,
  `student_old` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`,`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `t_student` */

insert  into `t_student`(`id`,`student_id`,`student_name`,`student_sex`,`student_old`) values (1,2011012488,'杨ch','男',22),(3,2011012001,'赵某某','男',20),(4,2011012002,'钱某某','男',21),(5,2011012003,'孙某某','女',22),(6,2011012004,'李某某','女',24);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) NOT NULL,
  `salt` varchar(255) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`user_name`,`salt`,`password`) values (1,'admin','8d78869f470951332959580424d4bf4f','d3c59d25033dbf980d29554025c23a75');

/*Table structure for table `t_user_group` */

DROP TABLE IF EXISTS `t_user_group`;

CREATE TABLE `t_user_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '0',
  `group_id` int(11) NOT NULL DEFAULT '0',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `last_modified_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `t_user_group` */

insert  into `t_user_group`(`id`,`user_id`,`group_id`,`created_time`,`last_modified_time`) values (1,1,1,'2016-04-18 09:55:50','0000-00-00 00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
