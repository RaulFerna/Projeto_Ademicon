CREATE EXTENSION IF NOT EXISTS "Ademicon"

    -- Table: public.cliente

    -- DROP TABLE IF EXISTS public.cliente;

    CREATE TABLE IF NOT EXISTS public.cliente
    (
        "Nome" character varying COLLATE pg_catalog."default" NOT NULL,
        "Endereco" character varying COLLATE pg_catalog."default" NOT NULL,
        "Telefone" character varying COLLATE pg_catalog."default",
        "Nome_responsavel" character varying COLLATE pg_catalog."default",
        id_cliente integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
        CONSTRAINT "Cliente_pkey" PRIMARY KEY ("Endereco")
    )

    TABLESPACE pg_default;

    ALTER TABLE IF EXISTS public.cliente
        OWNER to postgres;

    -- Table: public.consultor

    -- DROP TABLE IF EXISTS public.consultor;

    CREATE TABLE IF NOT EXISTS public.consultor
    (
        "Id_Consultor" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
        "Nome" character varying COLLATE pg_catalog."default",
        email character varying COLLATE pg_catalog."default",
        "Id_gestor" integer,
        CONSTRAINT "Consultor_pkey" PRIMARY KEY ("Id_Consultor"),
        CONSTRAINT id_gestor FOREIGN KEY ("Id_gestor")
            REFERENCES public.gestor ("Id_gestor") MATCH SIMPLE
            ON UPDATE NO ACTION
            ON DELETE NO ACTION
            NOT VALID
    )

    TABLESPACE pg_default;

    ALTER TABLE IF EXISTS public.consultor
        OWNER to postgres;

-- Table: public.gestor

-- DROP TABLE IF EXISTS public.gestor;

CREATE TABLE IF NOT EXISTS public.gestor
(
    "Id_gestor" integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    "Nome" character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    "Id_Consultor" integer,
    CONSTRAINT "Gestor_pkey" PRIMARY KEY ("Id_gestor"),
    CONSTRAINT "Id_Consultor" FOREIGN KEY ("Id_Consultor")
        REFERENCES public.consultor ("Id_Consultor") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.gestor
    OWNER to postgres;