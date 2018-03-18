CREATE TABLE public.link (
  link_id   VARCHAR(50)   PRIMARY KEY,
  link_url  VARCHAR(100)  NOT NULL,
  link_desc VARCHAR(250)  NOT NULL
);

INSERT INTO public.link (link_id, link_url, link_desc) VALUES ('324124213423324', 'http://www.google.com', 'Google');