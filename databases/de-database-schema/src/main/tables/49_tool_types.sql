SET search_path = public, pg_catalog;

--
-- A table listing the types of tools that are currently available.
--
CREATE TABLE tool_types (
    id uuid NOT NULL DEFAULT uuid_generate_v4(),
    name varchar(50) UNIQUE NOT NULL,
    label varchar(128) NOT NULL,
    description varchar(256)
);

