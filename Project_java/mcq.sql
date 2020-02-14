-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 14, 2020 at 09:02 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mcq`
--

-- --------------------------------------------------------

--
-- Table structure for table `englishdb`
--

CREATE TABLE `englishdb` (
  `QNum` varchar(10) NOT NULL,
  `Qn` varchar(500) NOT NULL,
  `op1` varchar(250) NOT NULL,
  `op2` varchar(250) NOT NULL,
  `op3` varchar(250) NOT NULL,
  `op4` varchar(250) NOT NULL,
  `corans` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `englishdb`
--

INSERT INTO `englishdb` (`QNum`, `Qn`, `op1`, `op2`, `op3`, `op4`, `corans`) VALUES
('fatf', 'asdfasfdahgf', 'ffytfytfsahcfashgf', 'asgfdahgsdfaf', 'ahgsfdhagsfdhf', 'sahgdfahsdfahsgf', 'gasfdhgasfdhg'),
('1', 'Bolt from the blue', 'Thundering', 'A complete surprise', 'Inform something bad', 'No idea', 'A complete surprise'),
('2', 'Blue blood', 'Belonging to low class society', 'Give complain in written', 'Member of high class society', 'Complain give verbally', 'Member of high class society'),
('3', ' When the Principal entered the class, a student………. on the blackboard.', 'Wrote', 'was writing', 'writes', 'Is writing', 's writing'),
('5', 'She………TV when her husband came', 'watch', 'was watching', 'is watching', 'watched', 'watch'),
('6', 'In each of the following questions, find the correctly spelt word', 'Reannaisance', 'Renaissance', 'Rennaissance', 'Renaisance', 'Renaissance'),
('4', 'Select Correct Word', 'Ac  eleration', 'Ac  eeleration', 'Accelaration', 'Acceleration', 'Accelaration'),
('7', 'Jawaharlal spent his childhood ______ Anand Bhawan.', ' at', 'in', 'on', 'across', 'across'),
('8', 'The boy was cured _____ typhoid', 'from', 'of', 'on', 'for', 'of'),
('9', 'Voracious…..', 'tenacious', 'truthful', 'spacious', 'ravenous', 'ravenous'),
('10', 'Abortive…..', 'fruitful', 'familiar', 'unsuccessful', 'consuming', 'unsuccessful'),
('11', ' Suguganya got —— as an officer in State bank of India.', ' appoint', 'appointed', ' appoints', 'appointee', ' appoints');

-- --------------------------------------------------------

--
-- Table structure for table `ethicsdb`
--

CREATE TABLE `ethicsdb` (
  `QNum` varchar(10) NOT NULL,
  `Qn` varchar(500) NOT NULL,
  `op1` varchar(250) NOT NULL,
  `op2` varchar(250) NOT NULL,
  `op3` varchar(250) NOT NULL,
  `op4` varchar(250) NOT NULL,
  `corans` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ethicsdb`
--

INSERT INTO `ethicsdb` (`QNum`, `Qn`, `op1`, `op2`, `op3`, `op4`, `corans`) VALUES
('1', 'Right to act without interference is', ' Negative right', 'Positive right', 'Natural right', 'None of above', 'Negative right'),
('1', 'Right to act without interference is', ' Negative right', 'Positive right', 'Natural right', 'None of above', 'Negative right'),
('2', 'Using some one’s else email ID, to do illegal or legal work on internet is:', 'Identity theft', 'prank', 'cyber bullying', 'Identity fraud', 'Identity theft'),
('3', 'What are ethical theories?', 'Ethical theories are the rules and principles that determine right and wrong for any given situation', 'Ethical theories are ancient hypothesis’ on how to create good business practice', ' Ethical theories are conduct that should be followed in order to have good ethical practice', 'Ethical theories give guidelines on how to achieve a good corporate image', 'Ethical theories are the rules and principles that determine right and wrong for any given situation'),
('4', 'Cookies on your computer means', 'files a web site stores on a visitor\'s computer', 'cookies and milk on your desktop', 'cookies that you can eat while using computer', 'none of above', 'files a web site stores on a visitor\'s computer'),
('5', 'What do you mean by digital divide?', 'Arithmetic division in digital form', 'Binary division', 'Performing division calculation through computer', 'An economic and social inequality regarding access to, use of, or impact of information and communication technologies.', 'An economic and social inequality regarding access to, use of, or impact of information and communication technologies. '),
('6', 'What is NOT an example of cyber bullying?', 'Creating an embarrassing picture of your classmate and forwarding it to your friend\'s email addresses', 'Bullying someone in the hallway ', 'Sending someone a mean text ', 'Threatening someone in an instant message', ' Bullying someone in the hallway'),
('7', 'Bullying someone in the hallway', 'Ban all the ISPs for over charging', 'Access all the data and information on the internet as same', 'visit and hack any websites on internet. ', 'Use the internet for free', 'Access all the data and information on the internet as same'),
('8', 'What do you mean by reverse engineering?', 'Performing all the engineering task in reverse manner.', 'Opposing the engineering course ', ' The reproduction of another manufacturer\'s product following detailed examination of its construction or composition.', 'None of the above', 'The reproduction of another manufacturer\'s product following detailed examination of its construction or composition.'),
('9', 'Which is an example of plagiarism?', 'Typing a paper in your own words', ' Reading a paragraph online and retyping it in your own words. ', 'Copying and pasting a sentence from the Internet into your paper.', 'Copying and pasting someone else\'s work into your paper using quotation marks and citing the author', 'Copying and pasting a sentence from the Internet into your paper.'),
('10', 'Claimed right means', ' an obligation of some people to provide certain things for others', ' to claim a right that you want.', 'Having a child.', 'None of above', 'an obligation of some people to provide certain things for others'),
('11', 'Net neutrality is:', 'The principle that governments should mandate Internet service providers to treat all data on the Internet the same', 'To neutralize the internet user', 'To provide the internet to all the user from a neutral zone. ', 'None of the above ', 'The principle that governments should mandate Internet service providers to treat all data on the Internet the same'),
('12', 'The theory that tend to emphasize duty and absolute rules, to be followed whether they lead to good or ill consequences in particular cases is known as:', 'Natural rights theories', 'Negative and positive rights theories ', ' Deontological theories', ' Utilitarianism theories', 'Deontological theories'),
('13', 'Offshoring means:', 'Getting work done in a different country', ' To contracting work out to an external organization.', 'Working from the shore of the beach using technology', 'None of the above', 'Getting work done in a different country'),
('14', 'Consequentialist theory is an example of', 'deontological theories', 'utilitarianism', 'natural rights', 'none of above', 'utilitarianism'),
('15', 'Intellectual property right protects', 'Song you wrote on your own.', 'You pet name', 'Land and property owned by your family', 'None of the above.', 'Song you wrote on your own');

-- --------------------------------------------------------

--
-- Table structure for table `javadb`
--

CREATE TABLE `javadb` (
  `QNum` varchar(10) NOT NULL,
  `Qn` varchar(500) NOT NULL,
  `op1` varchar(250) NOT NULL,
  `op2` varchar(250) NOT NULL,
  `op3` varchar(250) NOT NULL,
  `op4` varchar(250) NOT NULL,
  `corans` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `javadb`
--

INSERT INTO `javadb` (`QNum`, `Qn`, `op1`, `op2`, `op3`, `op4`, `corans`) VALUES
('1', 'Step by step instructions written to solve any problem is called', 'pseducode', 'algorithm', 'assembler', 'class', 'algorithm'),
('2', 'Diagramatic or symbolic representation of an algorithm is called', 'Data-Flow diagram', 'E-R diagram', 'Flowchart', 'None of the above', 'Flowchart'),
('3', 'Object oriented programming method is followed in', 'C programming language', 'C++ programming language', 'C# programming language', 'Both [B] and [C]', 'Both [B] and [C]'),
('4', 'Procedural programming method is followed in', 'C', 'COBOL', 'Cobra', 'All of the above ', 'All of the above'),
('5', 'Informal high level description of an algorithm in english is called', 'Function', 'Class', 'Pseudo code', 'none of the above', 'Pseudo code'),
('6', 'The geometrical figure shown below in flowchart represent', 'Looping', 'Processing', 'Connector', 'Start/top', 'Processing'),
('7', 'The geometrical figure shown below in flowchart represent', 'Input/Output', 'Terminator', 'Decision', 'Looping', 'Terminator'),
('8', 'The geometrical figure shown below in flowchart represent', 'Input/Output', 'Alternate process', 'Decision', 'Looping', 'Decision'),
('9', 'The geometrical figure shown below in flowchart represent', 'Connector', 'Alternate process', 'Data', 'Looping', 'Connector'),
('10', 'The geometrical figure shown below in flowchart represent', 'Input/Output', 'Alternate process', 'Data', 'Looping', 'Input/Output'),
('11', 'Step by step instructions written to solve any problem is called', 'pseducode', 'algorithm', 'assembler', 'class', 'algorithm'),
('12', 'Diagramatic or symbolic representation of an algorithm is called', 'Data-Flow diagram', 'E-R diagram', 'Flowchart', 'None of the above', 'Flowchart'),
('13', 'Object oriented programming method is followed in', 'Object oriented programming method is followed in', 'C++ programming language', 'C# programming language', 'Both [B] and [C]', 'Both [B] and [C]'),
('14', 'Procedural programming method is followed in', 'C', 'COBOL', 'Cobra', 'All of the above', 'All of the above'),
('15', 'Informal high level description of an algorithm in english is called', 'Function', 'Class', 'Pseudo code', 'None of the above', 'Pseudo code');

-- --------------------------------------------------------

--
-- Table structure for table `pythondb`
--

CREATE TABLE `pythondb` (
  `QNum` varchar(10) NOT NULL,
  `Qn` varchar(500) NOT NULL,
  `op1` varchar(250) NOT NULL,
  `op2` varchar(250) NOT NULL,
  `op3` varchar(250) NOT NULL,
  `op4` varchar(250) NOT NULL,
  `corans` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pythondb`
--

INSERT INTO `pythondb` (`QNum`, `Qn`, `op1`, `op2`, `op3`, `op4`, `corans`) VALUES
('asda', 'sdads', 'dsfasfdfe', 'dfascasc', 'dfsdcsd', 'sdfsefwe', 'dfsdvsdcs'),
('1', 'What is the meaning of HTTP status Code 403?', 'Success', 'Internal server error ', 'forbidden', 'Unauthorized error', 'Internal server error'),
('2', 'DOCTYPE declaration in xhtml is', ' a. none ', '<DOCTYPE! html>', '<DOCTYPE! html>', '<DOCTYPE! html>', '<DOCTYPE! html>'),
('3', 'HTML stands for?', 'hyper text mapping language', 'hyper text multi language', 'hyper text media language', 'Hyper text markup language ', 'Hyper text markup language'),
('5', 'Which of the following is attribute in element: <h1 class=”blue” style=”colore:red”>something</h1>', 'class', ' none', 'style', 'both', 'both'),
('6', 'How to make > sign in html?', '&gt;', '&greaterthan', '&lessthan', '&lt;', '&gt;'),
('7', 'Which of the following is semantic element?', 'all', '<artile>', '<table>', '<form>', '<artile>'),
('8', 'How can you open a link in a new tab/browser window?', '<a href=”url” target=”_next”>Link</a> ', 'none', '<a href=”url” target=”_tab”>Link</a>', '<a href=”url” target=”_new”>Link</a>', 'none'),
('9', 'Which tag is depreciated in HTML 5?', '<tbody>', '<font>', '<video>', '<nav>', '<font>'),
('10', 'How to create input field in html ?', '<input type=”text” /> ', '<input type=”textarea” />', '<input type=”textbox” />', '<input type=”text” ></input>', '<input type=”text” />'),
('11', 'Which of the following is correct for creating checkbox in html form', '<input type=”checkbox” />', '<checkbox>', '<input type=”check” />', '<input type=”check-box” />', '”checkbox” />'),
('12', 'What will be the output of the following code :-  Css:  P{text-transform: uppercase}  HTML:  <p>softwarica college</p>', 'softwarica college', ' SOFTWARICA COLLEGE', 'None of the above', 'Softwarica College', 'SOFTWARICA COLLEGE'),
('13', 'Which of the following is the example of descendant selector?  ', 'ul li{}', '*', 'None', 'P::first-line', 'P::first-line, ul li{}'),
('14', 'What is DOM?', 'Programming API for HTML and XML documents', 'Function as an argument', 'Function inside function', 'Data of modification', 'Programming API for HTML and XML documents'),
('15', 'PNG  stands for', 'Portable node graph ', 'Permanent network group', 'Portable network graphics', 'Picture non graphics', 'Portable network graphics');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `token` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`username`, `email`, `token`) VALUES
('renish', 'renish.shah', '409');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
