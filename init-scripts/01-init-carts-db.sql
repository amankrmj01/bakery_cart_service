-- Create extensions if needed
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- Create cart status enum type
CREATE TYPE cart_status AS ENUM ('ACTIVE', 'SAVED', 'ABANDONED', 'CONVERTED', 'EXPIRED');

-- Create cart item status enum type
CREATE TYPE cart_item_status AS ENUM ('ACTIVE', 'SAVED_FOR_LATER', 'REMOVED');

-- Ensure proper permissions
GRANT ALL PRIVILEGES ON DATABASE bakery_carts TO cart_user;

-- Create indexes for better performance
-- These will be created automatically by JPA, but good to have as reference

-- Cart indexes
-- CREATE INDEX IF NOT EXISTS idx_cart_user ON carts(user_id);
-- CREATE INDEX IF NOT EXISTS idx_cart_session ON carts(session_id);
-- CREATE INDEX IF NOT EXISTS idx_cart_status ON carts(status);
-- CREATE INDEX IF NOT EXISTS idx_cart_updated ON carts(updated_at);
-- CREATE INDEX IF NOT EXISTS idx_cart_expires ON carts(expires_at);

-- Cart item indexes
-- CREATE INDEX IF NOT EXISTS idx_cart_item_cart ON cart_items(cart_id);
-- CREATE INDEX IF NOT EXISTS idx_cart_item_product ON cart_items(product_id);
-- CREATE INDEX IF NOT EXISTS idx_cart_item_status ON cart_items(status);
