# MySQL-Front 3.2  (Build 6.2)

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET CHARACTER SET 'gbk' */;

# Host: localhost    Database: whisay
# ------------------------------------------------------
# Server version 5.0.18-nt

USE `whisay`;

#
# Table structure for table user
#

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(20) NOT NULL,
  `username` varchar(20) default NULL,
  `passwd` varchar(20) default NULL,
  `horoscope` varchar(20) default NULL,
  `district` varchar(20) default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

#
# Dumping data for table user
#

INSERT INTO `user` (`user_id`,`username`,`passwd`,`horoscope`,`district`) VALUES ('0001','jiang','silver',NULL,'shenyang');
INSERT INTO `user` (`user_id`,`username`,`passwd`,`horoscope`,`district`) VALUES ('u0005','xiaoguan','tiger','virgo','');
INSERT INTO `user` (`user_id`,`username`,`passwd`,`horoscope`,`district`) VALUES ('u0009','','','Aries','');

#
# Table structure for table whisaydata
#

DROP TABLE IF EXISTS `whisaydata`;
CREATE TABLE `whisaydata` (
  `user_id` varchar(10) default NULL,
  `username` varchar(20) default NULL,
  `saying` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

#
# Dumping data for table whisaydata
#


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
