INSERT INTO transporter (car_model, load_capacity, name) VALUES
    ('Reno', '300', 'Petro'),
    ('Reno', '500', 'Oleg'),
    ('Reno', '2000', 'Alex');

INSERT INTO warehouse (title, city, street, longitude, latitude) VALUES
    ('McDonald', 'Lviv', 'Shevchenka', '123.232.34' ,'54.153.13'),
    ('Cucumbers world', 'Kyiv', 'Maidan', '123.232.34' ,'54.153.13'),
    ('Tomatoes world', 'Nadvirna', 'Hreschatyk', '123.232.34' ,'54.153.13');

INSERT INTO delivery (cargo_amount, cargo_name, status, transporter_id, warehouse_to_id) VALUES
    ('500','tomatoes', 'SHIPPED', '2', '2'),
    ('200','cucumbers', 'CANCELED', '1', '1'),
    ('1000','pork', 'PENDING', '2', '2'),
    ('500','tomatoes', 'DELIVERED', '3', '3');






