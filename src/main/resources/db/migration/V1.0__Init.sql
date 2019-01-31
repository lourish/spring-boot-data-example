CREATE TABLE Job (
	id bigserial PRIMARY KEY,
	external_name VARCHAR(500) not null,
	raw_json TEXT not null
);
