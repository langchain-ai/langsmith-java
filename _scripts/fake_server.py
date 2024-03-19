import fastapi


app = fastapi.FastAPI()


@app.get("/runs/{run_id}")
@app.get("/runs")
@app.post("/runs")
async def handle_post_request(request: fastapi.Request):
    # Print request params
    print("Request Params:")
    for param in request.query_params:
        print(f"{param}: {request.query_params[param]}")

    # Print request body
    print("Request Body:")
    print(await request.body())

    # Print request headers
    print("Request Headers:")
    for header in request.headers:
        print(f"{header}: {request.headers[header]}")

    return {"message": "Request processed successfully"}


if __name__ == "__main__":
    import uvicorn

    uvicorn.run(app, host="0.0.0.0", port=8111)

# import uuid

# uid = str(uuid.uuid4())

# requests.post(
#     "https://api.smith.langchain.com/runs",
#     json={
#         "start_time": "2024-03-08T22:31:49Z",
#         "inputs": {"input": "Hello, World!"},
#         "name": "Java Test",
#         "end_time": "2024-03-08T22:32:49Z",
#         "id": uid,
#         "run_type": "chain",
#     },
#     headers={
#         "x-api-key": "ls__08ccb807d88042109e82ca41da4c299f",
#         "accept-encoding": "gzip",
#     },
# )
