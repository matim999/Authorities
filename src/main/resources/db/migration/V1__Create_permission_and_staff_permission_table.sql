CREATE SEQUENCE public.pair_pair_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE public.pair_pair_id_seq OWNER TO postgres;

CREATE TABLE public.pair (
    pair_id integer DEFAULT nextval('public.pair_pair_id_seq'::regclass) NOT NULL,
    staff_id smallint NOT NULL,
    rolee_id smallint NOT NULL
);

ALTER TABLE ONLY public.pair
    ADD CONSTRAINT pair_pkey PRIMARY KEY (pair_id);

ALTER TABLE public.pair OWNER TO postgres;

CREATE SEQUENCE public.rolee_rolee_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE public.rolee_rolee_id_seq OWNER TO postgres;

CREATE TABLE public.rolee (
    rolee_id integer DEFAULT nextval('public.rolee_rolee_id_seq'::regclass) NOT NULL,
    rolee character varying(60) NOT NULL
);

ALTER TABLE ONLY public.rolee
    ADD CONSTRAINT rolee_pkey PRIMARY KEY (rolee_id);

ALTER TABLE public.rolee OWNER TO postgres;

ALTER TABLE ONLY public.pair
    ADD CONSTRAINT pair_rolee_id_fkey FOREIGN KEY (rolee_id) REFERENCES public.rolee(rolee_id) ON UPDATE CASCADE ON DELETE RESTRICT;

INSERT INTO public.rolee VALUES (1, 'Role1');
INSERT INTO public.rolee VALUES (2, 'Role2');
INSERT INTO public.rolee VALUES (3, 'Role3');
INSERT INTO public.rolee VALUES (4, 'Role4');


INSERT INTO public.pair VALUES (1, 1, 1);
INSERT INTO public.pair VALUES (2, 1, 2);
INSERT INTO public.pair VALUES (3, 2, 1);