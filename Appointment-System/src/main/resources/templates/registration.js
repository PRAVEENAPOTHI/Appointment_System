document.addEventListener('DOMContentLoaded', function () {
    const registrationForm = document.getElementById('registrationForm');

    registrationForm.addEventListener('submit', async function (event) {
        event.preventDefault();

        const username = document.getElementById('username').value;
        const password = document.getElementById('password').value;
        const name = document.getElementById('name').value;
        const contact = document.getElementById('contact').value;
        const medicalHistory = document.getElementById('medicalHistory').value;

        // Perform client-side validation (add your own validation logic)

        // Send data to the server
        const response = await fetch('/api/register', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ username, password, name, contact, medicalHistory }),
        });

        if (response.ok) {
            // Registration successful, you can redirect or show a success message
            console.log('Registration successful');
        } else {
            // Handle registration error (show error message, etc.)
            console.error('Registration failed');
        }
    });
});
