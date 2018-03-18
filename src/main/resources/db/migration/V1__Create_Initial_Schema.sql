CREATE TABLE public.link (
  link_id   BIGSERIAL     PRIMARY KEY,
  link_url  VARCHAR(100)  NOT NULL,
  link_desc VARCHAR(250)  NOT NULL
);

INSERT INTO public.link (link_id, link_url, link_desc) VALUES (1, 'http://www.google.com', 'Google');