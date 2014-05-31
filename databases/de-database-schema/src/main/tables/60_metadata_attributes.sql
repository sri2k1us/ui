SET search_path = public, pg_catalog;

--
-- Stores known metadata field information.
--
CREATE TABLE metadata_attributes (
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    name varchar(64) NOT NULL,
    description varchar(1024) NOT NULL,
    required boolean NOT NULL,
    value_type_id uuid NOT NULL
);

