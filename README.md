# TripGenie AI 🧳✨

TripGenie AI is an AI-powered travel planner that generates personalized trip suggestions based on your preferences — like nature, cities, or adventure. Built using a Java backend (Spring Boot) and Python AI module.

---

## 🧠 How it works

1. The Java backend exposes a REST API to receive user preferences.
2. It passes them to the Python AI module.
3. The AI module generates a trip plan and returns suggestions.

---

## 🛠 Tech Stack

- **Backend**: Java 17, Spring Boot
- **AI Module**: Python 3
- **Communication**: Standard Input/Output (Java ⇄ Python)
- **API**: OpenAI (or custom logic — pluggable)

---

## 🚀 Getting Started

### 1. Clone the repository

```
git clone https://github.com/ai-explorer-nadiia/tripgenie-ai.git
cd tripgenie-ai
```

### 2. Set up the Python AI module

```
cd ai-module-python
python3 -m venv venv
source venv/bin/activate
pip install -r requirements.txt
```

### 3. Run the Java backend

```
cd ../backend-java
./mvnw spring-boot:run
```

📫 Contact

Created by @ai-explorer-nadiia https://github.com/ai-explorer-nadiia/ — feel free to contribute or reach out!
