-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jul 13, 2020 at 08:16 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Medical`
--

-- --------------------------------------------------------

--
-- Table structure for table `MedicalTable`
--

CREATE TABLE `MedicalTable` (
  `Category` text NOT NULL,
  `Sentence` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `MedicalTable`
--

INSERT INTO `MedicalTable` (`Category`, `Sentence`) VALUES
('Burnout', 'https://www.gallup.com/workplace/312827/beat-healthcare-burnout-effective-team-huddles.aspx (Article) '),
('Grief', 'https://www.talkspace.com/blog/coronavirus-talkspace-donation-healthcare-workers/ (Therapy Service) '),
('Fear of getting Covid-19', 'https://woebot.io/ (app) '),
('Stress and Shortage of PPE', 'https://thedoctorweighsin.com/mental-health-frontline-healthcare-workers/ (article) '),
('Preexisting Mental Health Conditions', 'https://www.nytimes.com/2020/07/11/nyregion/lorna-breen-suicide-coronavirus.html (article) '),
('Miscellaneous', ' https://dayoneapp.com/ (app) '),
(' Burnout', ' https://www.ahrq.gov/prevention/clinician/ahrq-works/burnout/index.html#:~:text=The%20health%20care%20environment%E2%80%94with,of%20sense%20of%20personal%20accomplishment'),
(' Fear of getting Covid-19', ' https://theconversation.com/how-doctors-fears-of-getting-covid-19-can-mean-losing-the-healing-power-of-touch-one-physicians-story-137379');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
