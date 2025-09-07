# Optional: quick README
@"
# Ebilling (Dev Stack)

Java 21 • Spring Boot 3.5.5 • Postgres 16 (Flyway + pgcrypto) • Kafka (KRaft) • Redis 7 • MailHog • Adminer • Docker Compose

## Quickstart
1) Copy env: \`cp .env.example .env\`
2) Build: \`mvn -DskipTests clean package\`
3) Run: \`docker compose --env-file .env -f docker-compose.dev.yml up -d --build\`

## Services
- App: http://localhost:8080/actuator/health
- Adminer: http://localhost:8081 (Server: db or localhost:15432)
- MailHog: http://localhost:8125 (SMTP 2525)
- Kafka: localhost:9094 (host), kafka:9092 (container)
- Redis: localhost:6380 (host), redis:6379 (container)
  "@ | Set-Content -Encoding UTF8 README.md