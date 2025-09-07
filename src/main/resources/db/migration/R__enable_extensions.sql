-- Repeatable: ensure extensions exist (safe if re-run)
CREATE EXTENSION IF NOT EXISTS pgcrypto;   -- provides gen_random_uuid()
-- (Optional alternative) CREATE EXTENSION IF NOT EXISTS "uuid-ossp"; -- provides uuid_generate_v4()
