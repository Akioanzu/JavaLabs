--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-05-15 23:41:57

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 202 (class 1259 OID 24739)
-- Name: tbl_dictionary; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tbl_dictionary (
    keyword character varying(150) NOT NULL,
    discription character varying(150) NOT NULL
);


ALTER TABLE public.tbl_dictionary OWNER TO postgres;

--
-- TOC entry 2813 (class 0 OID 24739)
-- Dependencies: 202
-- Data for Name: tbl_dictionary; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.tbl_dictionary (keyword, discription) FROM stdin;
BMV	Немецкий производитель автомобилей, мотоциклов, двигателей, а также велосипедов
Mitsubishi	Одна из самых крупных корпораций Японии, занимающихся выпуском автомобилей
Volkswagen	Немецкая автомобильная марка, одна из многих, принадлежащих концерну Volkswagen AG
Chrysler	американская автомобилестроительная компания. С начала 2014 года находится под 100 %-ным контролем итальянского автомобилестроительного концерна Fiat
Hyundai	южнокорейская автомобилестроительная компания. Крупнейший автопроизводитель в стране и четвёртый в мире. Штаб-квартира расположена в Сеуле
\.


--
-- TOC entry 2686 (class 2606 OID 24743)
-- Name: tbl_dictionary tbl_dictionary_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tbl_dictionary
    ADD CONSTRAINT tbl_dictionary_pkey PRIMARY KEY (keyword);


-- Completed on 2020-05-15 23:41:58

--
-- PostgreSQL database dump complete
--

