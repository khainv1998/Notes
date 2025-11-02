# chat-service (skeleton)

Requirements: JDK 17+, Maven 3.9+

Run:

```
mvn spring-boot:run
```

WebSocket endpoint: `ws://localhost:8084/ws/echo`

Quick test in browser console:

```js
const ws = new WebSocket('ws://localhost:8084/ws/echo');
ws.onmessage = (e) => console.log('msg:', e.data);
ws.onopen = () => ws.send('hello');
```

