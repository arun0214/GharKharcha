-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2016 at 05:58 AM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gharkharcha`
--

-- --------------------------------------------------------

--
-- Table structure for table `expense`
--

CREATE TABLE IF NOT EXISTS `expense` (
`id` int(5) NOT NULL,
  `getdate` varchar(20) NOT NULL,
  `food` varchar(15) NOT NULL,
  `shopping` varchar(15) NOT NULL,
  `rent` varchar(15) NOT NULL,
  `education` varchar(15) NOT NULL,
  `transportation` varchar(15) NOT NULL,
  `travel` varchar(15) NOT NULL,
  `extra` varchar(15) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expense`
--

INSERT INTO `expense` (`id`, `getdate`, `food`, `shopping`, `rent`, `education`, `transportation`, `travel`, `extra`) VALUES
(1, '0000-00-00', '200', '', '2345', '2345', '2345', '2345', '23456'),
(2, '2016-03-04', '4', '', '55', '677', '233', '677', '3433'),
(3, '2016-03-04', '4', '', '55', '677', '233', '677', '3433'),
(4, '2016-03-31', '56', '', '3454', '44', '5667', '44', '5677'),
(5, '2016-04-06', '345', '', '23456', '345', '345', '345', '345'),
(6, '2016-04-06', '345', '', '23456', '345', '345', '345', '345'),
(7, '2016-03-08', '55', '44', '', '44', '44', '44', '44'),
(8, '', '', '', '', '', '', '', ''),
(9, '2016-3-4', '444', '344', '44', '22', '35', '22', '45'),
(10, '2016-5-13', '3333', '344', '', '455', '78', '455', '78'),
(11, '2016-5', '89', '78', '9000', '89', '45', '89', '899'),
(12, '', '', '', '', '', '', '', ''),
(13, '2016-5-13', '66675', '56', '677', '67788', '778', '67788', '677');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`id` int(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'arun', 'arun');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `expense`
--
ALTER TABLE `expense`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `expense`
--
ALTER TABLE `expense`
MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `id` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
