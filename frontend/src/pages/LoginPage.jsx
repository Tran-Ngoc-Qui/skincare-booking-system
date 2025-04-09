// File: frontend/src/pages/LoginPage.jsx
import React, { useState } from "react";

export default function LoginPage() {
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [error, setError] = useState("");

    const handleLogin = async (e) => {
        e.preventDefault();
        setError("");

        try {
            const response = await fetch("http://localhost:8080/api/auth/login", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ email, password }),
            });

            if (response.ok) {
                const data = await response.json();
                console.log("Login success:", data);
                // TODO: lưu token, chuyển hướng đến dashboard
            } else {
                const msg = await response.text();
                setError("Đăng nhập thất bại: " + msg);
            }
        } catch (err) {
            console.error(err);
            setError("Lỗi kết nối đến máy chủ.");
        }
    };

    return (
        <div className="flex justify-center items-center h-screen bg-gray-100">
            <form
                className="bg-white p-8 rounded-xl shadow-md w-full max-w-md"
                onSubmit={handleLogin}
            >
                <h2 className="text-2xl font-bold mb-6 text-center">Đăng nhập</h2>

                {error && <div className="text-red-500 mb-4">{error}</div>}

                <input
                    type="email"
                    placeholder="Email"
                    className="w-full p-3 mb-4 border rounded"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                    required
                />

                <input
                    type="password"
                    placeholder="Mật khẩu"
                    className="w-full p-3 mb-4 border rounded"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    required
                />

                <button
                    type="submit"
                    className="w-full bg-blue-500 text-white py-3 rounded hover:bg-blue-600 transition"
                >
                    Đăng nhập
                </button>
            </form>
        </div>
    );
}
