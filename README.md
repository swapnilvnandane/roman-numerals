# Roman Numerals Converter

This project provides a utility to convert a string of Roman numerals into its shortest equivalent representation. It handles the conversion of various combinations of Roman numeral characters and ensures the output is in its most compact form.

## Features

- Converts Roman numeral strings into their shortest equivalent.
- Handles edge cases such as empty input or invalid combinations.
- Supports Roman numeral characters: `I`, `V`, `X`, `L`, `C`, `D`, `M`.

## Usage

### Example Input and Output

| Input            | Output |
|-------------------|--------|
| `LLLXXXVVVV`     | `CC`   |
| `VVVV`           | `XX`   |
| `IIII`           | `IIII` |
| `MMMM`           | `MMMM` |
| (empty string)    | (empty string) |
| `X`              | `X`    |
| `XIIII`          | `XIIII`|
| `DD`             | `M`    |

### Running the Program

1. Clone the repository:
   ```bash
   git clone https://github.com/swapnilvnandane/roman-numerals.git
   cd roman-numerals