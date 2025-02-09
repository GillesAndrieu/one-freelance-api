CREATE TABLE IF NOT EXISTS customer (
    id uuid NOT NULL,
    profile jsonb NOT NULL,
    CONSTRAINT customer_pkey PRIMARY KEY (id)
);

