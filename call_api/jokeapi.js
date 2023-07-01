const API_URL = "https://v2.jokeapi.dev/joke/Programming";

async function fetchData(url, options = undefined) {
  try {
    const response = await fetch(url, options);
    if (!response.ok) throw new Error("⛔ERROR RESPONSE DATA⛔");

    const data = await response.json();
    return data;
  } catch (error) {
    console.log(error.message);
  }
}

fetchData(API_URL)
  .then((data) => {
    if (data.error) throw new Error("⛔DATA ERROR⛔");

    console.log(data);
  })
  .catch((error) => console.log(error.message));
