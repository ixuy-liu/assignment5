document.addEventListener("DOMContentLoaded", function () {
    const loginForm = document.getElementById("loginForm");

    // Hardcoded user credentials
    const storedEmail = "usertest@gmail.com";
    const storedPassword = "user123";

    loginForm.addEventListener("submit", function (event) {
        event.preventDefault(); // Prevent form submission

        let isValid = true;

        // Get user input values
        const emailInput = document.getElementById("email");
        const passwordInput = document.getElementById("password");

        // Email format validation
        if (!emailInput.value.includes("@") || emailInput.value.length < 5) {
            emailInput.classList.add("is-invalid");
            emailInput.nextElementSibling.textContent = "Please enter a valid email.";
            isValid = false;
        } 
        // Check if email matches stored user
        else if (emailInput.value !== storedEmail) {
            emailInput.classList.add("is-invalid");
            emailInput.nextElementSibling.textContent = "Incorrect email. Try again.";
            isValid = false;
        } else {
            emailInput.classList.remove("is-invalid");
        }

        // Password required validation
        if (passwordInput.value.trim() === "") {
            passwordInput.classList.add("is-invalid");
            passwordInput.nextElementSibling.textContent = "Password is required.";
            isValid = false;
        } 
        // Check if password matches stored password
        else if (passwordInput.value !== storedPassword) {
            passwordInput.classList.add("is-invalid");
            passwordInput.nextElementSibling.textContent = "Incorrect password. Try again.";
            isValid = false;
        } else {
            passwordInput.classList.remove("is-invalid");
        }

        // If all inputs are valid, redirect to the home page
        if (isValid) {
            alert("Login Successful! Redirecting...");
            window.location.href = "home.html"; // Redirect to home page
        }
    });
});
