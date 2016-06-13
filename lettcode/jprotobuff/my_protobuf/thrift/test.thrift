namespace java com.compare.thriftfile

struct HelloTest{
    1:required i32 id,
    2:optional string name = "default",
    3:optional string speak,
    4:optional list<string> phone,
}

struct HelloCon{
    1:optional list<HelloTest> hello,
}