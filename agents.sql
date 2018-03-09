-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 09, 2018 at 05:07 PM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `travelexperts`
--

-- --------------------------------------------------------

--
-- Table structure for table `agents`
--

CREATE TABLE `agents` (
  `AgentId` int(11) NOT NULL,
  `AgtFirstName` varchar(20) DEFAULT NULL,
  `AgtMiddleInitial` varchar(5) DEFAULT NULL,
  `AgtLastName` varchar(20) DEFAULT NULL,
  `AgtBusPhone` varchar(20) DEFAULT NULL,
  `AgtEmail` varchar(50) DEFAULT NULL,
  `AgtPosition` varchar(20) DEFAULT NULL,
  `AgencyId` int(11) DEFAULT NULL,
  `Username` varchar(20) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `agents`
--

INSERT INTO `agents` (`AgentId`, `AgtFirstName`, `AgtMiddleInitial`, `AgtLastName`, `AgtBusPhone`, `AgtEmail`, `AgtPosition`, `AgencyId`, `Username`, `Password`) VALUES
(1, 'Janet', NULL, 'Delton', '(403) 210-7801', 'janet.delton@travelexperts.com', 'Senior Agent', 1, 'Janet', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(2, 'Judy', NULL, 'Lisle', '(403) 210-7802', 'judy.lisle@travelexperts.com', 'Intermediate Agent', 1, 'Judy', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(3, 'Dennis', 'C.', 'Reynolds', '(403) 210-7843', 'dennis.reynolds@travelexperts.com', 'Junior Agent', 1, 'Dennis', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(4, 'John', 'C', 'Coville', '(403) 210-7823', 'john.coville@travelexperts.com', 'Intermediate Agent', 1, 'Name', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(6, 'Bruce', 'J.', 'Dixon', '(403) 210-7867', 'bruce.dixon@travelexperts.com', 'Intermediate Agent', 2, 'Name', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(7, 'Beverly', 'S.', 'Jones', '(403) 210-7812', 'beverly.jones@travelexperts.com', 'Intermediate Agent', 2, 'Name', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(8, 'Jane', NULL, 'Merrill', '(403) 210-7868', 'jane.merrill@travelexperts.com', 'Senior Agent', 2, 'Name', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(9, 'Brian', 'S.', 'Peterson', '(403) 210-7833', 'brian.peterson@travelexperts.com', 'Junior Agent', 2, 'Name', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(11, 'Tom', 'E', 'Jones', '18881234567', 'tom.jones@gmail.com', 'Junior Agent', 1, 'Name', '58Q7Sg9XsPMXRw2jpfxh0Q=='),
(12, 'Tom2', 'E', 'Jones', '1-888-123-4567', 'tom.jones@gmail.com', 'Junior Agent', 1, 'Name', '58Q7Sg9XsPMXRw2jpfxh0Q==');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agents`
--
ALTER TABLE `agents`
  ADD PRIMARY KEY (`AgentId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `agents`
--
ALTER TABLE `agents`
  MODIFY `AgentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
