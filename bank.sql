-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2018 at 05:24 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `deposite`
--

CREATE TABLE `deposite` (
  `acno` int(5) NOT NULL,
  `depno` int(11) NOT NULL,
  `amount` int(5) NOT NULL,
  `dates` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `deposite`
--

INSERT INTO `deposite` (`acno`, `depno`, `amount`, `dates`) VALUES
(6, 19, 10, '2018-11-22'),
(15, 21, 400, '2018-11-22');

-- --------------------------------------------------------

--
-- Table structure for table `personal`
--

CREATE TABLE `personal` (
  `acno_id` int(3) NOT NULL,
  `nameid` varchar(15) NOT NULL,
  `addressid` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personal`
--

INSERT INTO `personal` (`acno_id`, `nameid`, `addressid`) VALUES
(1, 'mac', 'lond'),
(2, 'joel', 'londo'),
(3, 'loies', 'piut'),
(4, 'uoi', 'gpp'),
(5, 'jo', 'london'),
(6, 'holly', 'holytown'),
(7, 'goop', 'gopptown'),
(8, 'goop', 'dopptown'),
(9, 'goerge', 'foow'),
(10, 'tom', 'tom'),
(11, 'HOY', 'joyu'),
(12, 'fo', 'go'),
(13, 'yoel', 'hoville'),
(14, 'shafeeq', 'london'),
(15, 'josh', 'london'),
(16, 'joy', 'kooland'),
(17, 'roeal', 'rocka');

-- --------------------------------------------------------

--
-- Table structure for table `withdraw`
--

CREATE TABLE `withdraw` (
  `acno` int(11) NOT NULL,
  `withdrawid` int(5) NOT NULL,
  `amount` int(5) NOT NULL,
  `dates` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`acno`, `withdrawid`, `amount`, `dates`) VALUES
(15, 40, 100, '2018-11-22'),
(15, 41, 100, '2018-11-22'),
(6, 42, 10, '2018-11-22'),
(15, 43, 200, '2018-11-22'),
(15, 44, 200, '2018-11-22'),
(15, 45, 200, '2018-11-22');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `deposite`
--
ALTER TABLE `deposite`
  ADD PRIMARY KEY (`depno`),
  ADD KEY `acno` (`acno`);

--
-- Indexes for table `personal`
--
ALTER TABLE `personal`
  ADD PRIMARY KEY (`acno_id`);

--
-- Indexes for table `withdraw`
--
ALTER TABLE `withdraw`
  ADD PRIMARY KEY (`withdrawid`),
  ADD KEY `acno` (`acno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `deposite`
--
ALTER TABLE `deposite`
  MODIFY `depno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `personal`
--
ALTER TABLE `personal`
  MODIFY `acno_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `withdraw`
--
ALTER TABLE `withdraw`
  MODIFY `withdrawid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `deposite`
--
ALTER TABLE `deposite`
  ADD CONSTRAINT `deposite_ibfk_1` FOREIGN KEY (`acno`) REFERENCES `personal` (`acno_id`);

--
-- Constraints for table `withdraw`
--
ALTER TABLE `withdraw`
  ADD CONSTRAINT `withdraw_ibfk_1` FOREIGN KEY (`acno`) REFERENCES `personal` (`acno_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
