const fs = require('fs').promises;
const path = require('path');

async function displayTransactions() {
  try {
    // TODO: Read 'transactions.json' file using fs.readFile or fs.readFile with async/await

    const filePath = path.join(__dirname, 'data/transactions.json');

    const data = await fs.readFile(filePath, 'utf-8');

    const transactions = JSON.parse(data);

    console.log("Transactions:", transactions);
   
  } catch (error) {
    // TODO: Handle errors that occur during file reading or JSON parsing

    console.error("Error:", error.message);

  }
}

displayTransactions();
