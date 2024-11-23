"use client"; 

import React, { useState } from 'react';
import styles from '../app/pages/css/Login.module.css';

const LoginPage: React.FC = () => {
  const [formState, setFormState] = useState({
    email: '',
    password: ''
  });

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    const { name, value } = e.target;
    setFormState(prevState => ({
      ...prevState,
      [name]: value
    }));
  };

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    console.log('Logging in with', formState.email, formState.password);
  };

  return (
    <div className={styles.background}>
      <div className={styles.formContainer}>
        <h2 className={styles.formTitle}>Login</h2>
        <form onSubmit={handleSubmit}>
          <div className={styles.formGroup}>
            <label htmlFor="email">Email:</label>
            <input
              id="email"
              name="email"
              type="email"
              value={formState.email}
              onChange={handleChange}
              required
            />
          </div>
          <div className={styles.formGroup}>
            <label htmlFor="password">Password:</label>
            <input
              id="password"
              name="password"
              type="password"
              value={formState.password}
              onChange={handleChange}
              required
            />
          </div>
          <button type="submit" className={styles.submitButton}>Login</button>
        </form>
      </div>
    </div>
  );
};

export default LoginPage;