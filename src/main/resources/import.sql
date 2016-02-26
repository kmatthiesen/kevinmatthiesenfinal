--
-- PostgreSQL database dump
--

-- Dumped from database version 9.4.4
-- Dumped by pg_dump version 9.4.4
-- Started on 2016-02-26 14:10:06

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

SET search_path = public, pg_catalog;

--
-- TOC entry 2020 (class 0 OID 36020)
-- Dependencies: 173
-- Data for Name: customer; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO customer VALUES (1, 'brad@brad.com', 'Brad', 'Larsen', '987-654-3210');
INSERT INTO customer VALUES (2, 'kevin@kevin.com', 'Kevin', 'Matthiesen', '111-111-1111');
INSERT INTO customer VALUES (3, 'mike@mike.com', 'Mike', 'Kness', '123-456-7890');
INSERT INTO customer VALUES (4, 'billy@billy.com', 'Billy', 'Billy', '123-456-9999');
INSERT INTO customer VALUES (5, 'rick@rick.com', 'Rick', 'Rick', '456-785-1634');
INSERT INTO customer VALUES (6, 'will@will.com', 'Will', 'Will', '156-765-4563');


--
-- TOC entry 2036 (class 0 OID 0)
-- Dependencies: 172
-- Name: customer_customerid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('customer_customerid_seq', 6, true);



--
-- TOC entry 2024 (class 0 OID 36039)
-- Dependencies: 177
-- Data for Name: vehicle; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO vehicle VALUES (1, 'Red', 'Oregon', '123456', 'Honda', 'Civic');
INSERT INTO vehicle VALUES (2, 'Red', 'Mars', '123456', 'Ford', 'F250');
INSERT INTO vehicle VALUES (3, 'Red', 'Washington', '98456', 'Ford', 'Grand Prix');
INSERT INTO vehicle VALUES (4, 'Blue', 'Washington', '54645', 'Toyota', 'Celica');
INSERT INTO vehicle VALUES (5, 'Yellow', 'Oregon', '54645', 'Pontiac', 'Grand Prix');
INSERT INTO vehicle VALUES (6, 'Moon Grey', 'Earth', 'NCC-1701', 'Federation', 'Starship');
INSERT INTO vehicle VALUES (7, 'Pink', 'Vancouver BC', 'NoValid', 'Toyota', 'Starship');
INSERT INTO vehicle VALUES (8, 'Yellow', 'Texas', 'WORDS', 'Toyota', 'Corola');
INSERT INTO vehicle VALUES (9, 'FireflyColor', 'Sol', 'LKJS143', 'Firefly', 'Ship');


--
-- TOC entry 2038 (class 0 OID 0)
-- Dependencies: 176
-- Name: vehicle_vehicleid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('vehicle_vehicleid_seq', 9, true);


--
-- TOC entry 2022 (class 0 OID 36031)
-- Dependencies: 175
-- Data for Name: pass; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO pass VALUES (1, '2016-03-27 13:56:33.58', 24.989999999999998, 3, 5);
INSERT INTO pass VALUES (4, '2017-02-25 14:01:10.034', 225.46000000000001, 1, 6);
INSERT INTO pass VALUES (6, '2016-03-04 14:01:10.034', 7.5, 4, 4);
INSERT INTO pass VALUES (8, '2017-02-25 14:04:48.041', 225.46000000000001, 3, 9);
INSERT INTO pass VALUES (7, '2016-02-22 14:01:10.034', 24.989999999999998, 5, 1);
INSERT INTO pass VALUES (9, '2016-02-28 14:04:48.041', 7.5, 1, 8);
INSERT INTO pass VALUES (5, '2016-02-04 14:01:10.034', 7.5, 2, 7);
INSERT INTO pass VALUES (10, '2016-01-27 14:07:23.307', 24.989999999999998, 2, 5);
INSERT INTO pass VALUES (11, '2016-02-19 14:07:23.307', 24.989999999999998, 6, 3);
INSERT INTO pass VALUES (12, '2016-02-20 14:07:23.307', 24.989999999999998, 5, 4);


--
-- TOC entry 2037 (class 0 OID 0)
-- Dependencies: 174
-- Name: pass_passid_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('pass_passid_seq', 12, true);


-- Completed on 2016-02-26 14:10:06

--
-- PostgreSQL database dump complete
--

