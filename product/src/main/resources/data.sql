--DELETE FROM product_categories;
--DELETE FROM product;
--DELETE FROM category;

  
INSERT INTO category (NAME) VALUES
  ('Fragile'),
  ('Hi-Tech'),
  ('Outdoor'),
  ('Kitchenware');
  
INSERT INTO product (NAME) VALUES
  ('Picnic Forks'),
  ('Smartphone'),
  ('Autonomous Lawn Mower'),
  ('Mirror');
  
INSERT INTO product_categories (ID_PRODUCT,ID_CATEGORY) VALUES
  ((select ID from product where NAME='Picnic Forks'),(select ID from category where NAME='Kitchenware')),
  ((select ID from product where NAME='Picnic Forks'),(select ID from category where NAME='Outdoor')),
  ((select ID from product where NAME='Smartphone'),(select ID from category where NAME='Hi-Tech')),
  ((select ID from product where NAME='Smartphone'),(select ID from category where NAME='Fragile')),
  ((select ID from product where NAME='Autonomous Lawn Mower'),(select ID from category where NAME='Outdoor')),
  ((select ID from product where NAME='Autonomous Lawn Mower'),(select ID from category where NAME='Hi-Tech')),
  ((select ID from product where NAME='Mirror'),(select ID from category where NAME='Fragile'));
