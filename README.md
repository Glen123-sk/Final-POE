# Final-POE

This project contains a small Java login validator with separate checks for username, password, and South African cell phone numbers.

## Run Tests

```bash
mvn test
```

## Validation Rules

- Username must contain an underscore and be no more than five characters long.
- Password must be at least eight characters long and include one uppercase letter, one number, and one special character.
- Cell phone number must be a South African number starting with `0` or `+27` and contain the correct number of digits.