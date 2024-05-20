# Library Book Database

## Introduction
This repository contains documentation for the implementation of data protection principles in the library's book database. The focus is on the Book class and how it facilitates separate functionality for library customers and staff.

## Principle of Data Protection: Separation of Concerns

### Overview
Separation of Concerns is a design principle that advocates for dividing a system into distinct sections, each addressing a separate concern. For the library's book database, this principle is applied to ensure that:

- Library customers can only read book information.
- Library staff can modify book information.

### Implementation Details
To implement Separation of Concerns for the Book class, the following mechanisms are employed:

1. **Read-Only Access for Customers**:
   - Class Features: The Book class provides getter methods for retrieving information about a book (e.g., getTitle(), getPublicationYear(), getPublisher()). These methods allow library customers to view book details without modifying them.
   - Class Invariant: The Book class ensures that its internal state remains immutable once created, preventing customers from inadvertently modifying book data.
   - Usage: Library customers access Book objects through a read-only interface, restricting them from making any changes to book information.

2. **Read-Write Access for Staff**:
   - Class Features: In addition to getters, the Book class provides setter methods for modifying book information (e.g., setTitle(), setPublicationYear(), setPublisher()). These methods enable library staff to update book details as needed.
   - Class Invariant: The Book class maintains consistency and validity after modifications made by staff, ensuring that the database remains accurate and up-to-date.
   - Usage: Library staff members access Book objects through a read-write interface, allowing them to make updates, corrections, or deletions to book records.

## Conclusion
By adhering to the principle of Separation of Concerns, the library's book database effectively serves the distinct needs of both customers and staff, ensuring data integrity and usability.
