<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Pablo de Ronaldo | Portfolio</title>
  <style>
    * { margin: 0; padding: 0; box-sizing: border-box; }

    body {
      font-family: 'Poppins', sans-serif;
      background: #f9f9f9;
      color: #333;
      line-height: 1.6;
    }

    header {
      background: #111;
      color: white;
      padding: 20px 0;
      text-align: center;
    }

    nav a {
      color: white;
      margin: 0 15px;
      text-decoration: none;
      font-weight: 500;
    }

    nav a:hover { color: #00bfa6; }

    /* === HERO SECTION WITH DARKENED BACKGROUND === */
    .hero {
      text-align: center;
      padding: 120px 20px;
      color: white;
      background: 
        linear-gradient(rgba(0, 0, 0, 0.6), rgba(0, 0, 0, 0.6)), 
        url('https://images.unsplash.com/photo-1519389950473-47ba0277781c?auto=format&fit=crop&w=1920&q=80') 
        no-repeat center center;
      background-size: cover;
    }

    .hero h1 {
      font-size: 2.8rem;
      margin-bottom: 15px;
    }

    .hero p {
      font-size: 1.2rem;
      max-width: 700px;
      margin: 0 auto;
    }

    section {
      max-width: 1000px;
      margin: 60px auto;
      padding: 0 20px;
    }

    /* === UNDERLINED SECTION TITLES === */
    h2 {
      position: relative;
      text-align: center;
      margin-bottom: 30px;
      color: #00bfa6;
      font-size: 1.8rem;
    }

    h2::after {
      content: "";
      position: absolute;
      bottom: -8px;
      left: 50%;
      transform: translateX(-50%);
      width: 60px;
      height: 3px;
      background-color: #00bfa6;
      border-radius: 2px;
    }

    /* === ABOUT SECTION === */
    .about-container {
      display: flex;
      flex-wrap: wrap;
      align-items: center;
      justify-content: center;
      gap: 30px;
      margin-top: 30px;
    }

    .profile-pic {
      width: 220px;
      height: 220px;
      border-radius: 50%;
      object-fit: cover;
      box-shadow: 0 4px 10px rgba(0,0,0,0.3);
    }

    .about-text {
      flex: 1;
      min-width: 280px;
      max-width: 600px;
      text-align: left;
    }

    /* === READ MORE BUTTON === */
    .read-more {
      display: inline-block;
      margin-top: 20px;
      background-color: #00bfa6;
      color: white;
      padding: 10px 20px;
      border-radius: 25px;
      text-decoration: none;
      font-weight: 600;
      transition: background 0.3s ease, transform 0.2s ease;
    }

    .read-more:hover {
      background-color: #009b86;
      transform: scale(1.05);
    }

    /* === PROJECTS SECTION === */
    .projects {
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
      gap: 25px;
    }

    .project {
      background: white;
      padding: 20px;
      border-radius: 12px;
      box-shadow: 0 2px 6px rgba(0,0,0,0.1);
      transition: transform 0.3s ease;
      text-align: center;
    }

    .project:hover { transform: translateY(-5px); }

    .project img {
      width: 100%;
      height: 180px;
      object-fit: cover;
      border-radius: 10px;
      margin-bottom: 15px;
    }

    .project h3 { margin-bottom: 10px; color: #00bfa6; }

    /* === CONTACT SECTION === */
    .contact { text-align: center; }
    .contact a { color: #00bfa6; text-decoration: none; font-weight: bold; }

    /* === CONTACT FORM === */
    form {
      max-width: 600px;
      margin: 30px auto 0;
      background: white;
      padding: 25px;
      border-radius: 10px;
      box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    }

    form input, form textarea {
      width: 100%;
      padding: 12px;
      margin: 10px 0;
      border: 1px solid #ddd;
      border-radius: 6px;
      font-size: 1rem;
    }

    form textarea {
      resize: vertical;
      min-height: 120px;
    }

    form button {
      background-color: #00bfa6;
      color: white;
      border: none;
      padding: 12px 25px;
      font-size: 1rem;
      border-radius: 25px;
      cursor: pointer;
      font-weight: 600;
      transition: background 0.3s ease, transform 0.2s ease;
    }

    form button:hover {
      background-color: #009b86;
      transform: scale(1.05);
    }

    /* === FOOTER === */
    footer {
      background: #111;
      color: white;
      text-align: center;
      padding: 15px 0;
      margin-top: 40px;
    }

    /* === RESPONSIVE DESIGN === */
    @media (max-width: 768px) {
      .hero h1 { font-size: 2rem; }
      .about-text { text-align: center; }
    }
  </style>
</head>
<body>

  <header>
    <h1>Pablo de Ronaldo</h1>
    <nav>
      <a href="#about">About</a>
      <a href="#projects">Projects</a>
      <a href="#contact">Contact</a>
    </nav>
  </header>

  <section class="hero">
    <h1>Hello, I'm Pablo 👋</h1>
    <p>A passionate web developer and creative thinker, crafting ideas into elegant digital experiences.</p>
  </section>

  <!-- === ABOUT ME SECTION === -->
  <section id="about" class="about">
    <h2>About Me</h2>
    <div class="about-container">
      <img src="https://i.pinimg.com/736x/57/16/6a/57166a79afaabefac92058fa0b0a2709.jpg" alt="Pablo de Ronaldo" class="profile-pic">
      <div class="about-text">
        <p>
          Hi! I'm <strong>Pablo de Ronaldo</strong> — a creative web developer who turns ideas into modern, 
          functional, and visually appealing web experiences. I have a deep passion for technology, 
          design, and innovation. When I'm not coding, you'll find me sketching concepts, exploring 
          new frameworks, or learning about UI/UX trends.
        </p>
        <p>
          My mission is to blend creativity with logic — building digital products that not only 
          work flawlessly but also feel intuitive and inspiring to use.
        </p>
        <a href="#projects" class="read-more">Read More</a>
      </div>
    </div>
  </section>

  <!-- === PROJECTS SECTION === -->
  <section id="projects">
    <h2>Projects</h2>
    <div class="projects">
      <div class="project">
        <img src="c:\Users\user\Pictures\Screenshots\Screenshot (22).png" alt="Portfolio Website">
        <h3>Portfolio Website</h3>
        <p>A responsive personal portfolio built with HTML and CSS.</p>
      </div>

      <div class="project">
        <img src="c:\Users\user\Pictures\Screenshots\Screenshot (27).png" alt="Code Screenshot">
        <h3>Background Image</h3>
        <p>A website created to show people how a background image looks like.</p>
      </div>

      <div class="project">
        <img src="c:\Users\user\Pictures\Screenshots\Screenshot 2025-09-05 204852.png" alt="Project Showcase">
        <h3>Birthday Page</h3>
        <p>A website created for people to also send birthday wishes and pictures to people.</p>
      </div>
    </div>
  </section>

  <!-- === CONTACT SECTION === -->
  <section id="contact" class="contact">
    <h2>Contact</h2>
    <p>Let's collaborate! Reach me at 
      <a href="mailto:adewutorp@.com">adewutorp@.com</a>
    </p>

    <!-- === CONTACT FORM === -->
    <form action="#" method="post">
      <input type="text" name="name" placeholder="Your Name" required>
      <input type="email" name="email" placeholder="Your Email" required>
      <input type="text" name="subject" placeholder="Subject" required>
      <textarea name="message" placeholder="Your Message..." required></textarea>
      <button type="submit">Send Message</button>
    </form>
  </section>

  <footer>
    <p>© 2025 Pablo de Ronaldo | All Rights Reserved</p>
  </footer>

</body>
</html>
