/*
Navicat MySQL Data Transfer

Source Server         : aliyun
Source Server Version : 50148
Source Host           : qdm154746529.my3w.com:3306
Source Database       : qdm154746529_db

Target Server Type    : MYSQL
Target Server Version : 50148
File Encoding         : 65001

Date: 2017-04-05 22:58:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ssm_user
-- ----------------------------
DROP TABLE IF EXISTS `ssm_user`;
CREATE TABLE `ssm_user` (
  `id` int(11) DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `birthday` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of ssm_user
-- ----------------------------
