
CREATE DATABASE `db_ssm_sample`;

USE `db_ssm_sample`;

-- ----------------------------
--  Table structure for `t_course`
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(32) NOT NULL,
  `course_teachername` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_course`
-- ----------------------------
BEGIN;
INSERT INTO `t_course` VALUES ('1', '高等数学', '周老师'), ('2', '线性代数', '吴老师'), ('3', '离散数学', '郑老师'), ('4', '概率论', '王老师');
COMMIT;

-- ----------------------------
--  Table structure for `t_score`
-- ----------------------------
DROP TABLE IF EXISTS `t_score`;
CREATE TABLE `t_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `score` int(11) NOT NULL,
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_score`
-- ----------------------------
BEGIN;
INSERT INTO `t_score` VALUES ('1', '99', '2011012488', '1'), ('14', '88', '2011012001', '3'), ('16', '77', '2011012488', '3'), ('17', '88', '2011012488', '4');
COMMIT;

-- ----------------------------
--  Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(32) NOT NULL,
  `student_name` varchar(32) NOT NULL,
  `student_sex` varchar(2) DEFAULT NULL,
  `student_old` int(2) DEFAULT NULL,
  PRIMARY KEY (`id`,`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_student`
-- ----------------------------
BEGIN;
INSERT INTO `t_student` VALUES ('1', '2011012488', '杨ch', '男', '22'), ('3', '2011012001', '赵某某', '男', '20'), ('4', '2011012002', '钱某某', '男', '21'), ('5', '2011012003', '孙某某', '女', '22'), ('6', '2011012004', '李某某', '女', '24');
COMMIT;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('1', 'admin', '21232f297a57a5a743894a0e4a801fc3');
COMMIT;