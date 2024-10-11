# Oracle-Currency-Converter-Challenge
Conversor de Monedas en Java

# Currency Converter API Client

This is a simple **Currency Converter** project that fetches the latest exchange rates using the [ExchangeRate-API](https://www.exchangerate-api.com/) and converts between different currencies. The project is built in **Java** and demonstrates the use of **HTTP requests**, **JSON parsing**, and handling **external APIs**.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [How It Works](#how-it-works)
- [What I Learned](#what-i-learned)
- [Next Steps](#next-steps)

## Overview

The **Currency Converter API Client** is designed to retrieve real-time exchange rates and perform currency conversions. It uses the `HttpClient` from the Java Standard Library to send GET requests to the ExchangeRate-API, and the `Gson` library to parse the JSON responses from the API.

## Features

- Retrieve the latest exchange rates from a given base currency.
- Perform currency conversion based on real-time exchange rates.
- Handle API responses and errors (such as 404 and 500 status codes).
  
## Technologies Used

- **Java 11+**: Main programming language
- **HttpClient**: For making HTTP requests
- **Gson**: For parsing JSON responses from the API
- **ExchangeRate-API**: External API for getting exchange rates

## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/currency-converter.git
   cd currency-converter
