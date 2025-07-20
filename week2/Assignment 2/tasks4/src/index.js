const express = require('express')
const morgan = require('morgan')
const bodyParser = require('body-parser')

const routes = require('./routes');

const app = express();

app.use(morgan("dev"));
app.use(bodyParser.json());

routes(app);

const PORT = 3000;
app.listen(3000, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});

