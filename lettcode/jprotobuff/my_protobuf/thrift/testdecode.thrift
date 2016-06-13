namespace java com.compare.thriftfile

struct HelloTestDecode{
    1:required i32 iddecode,
    2:optional string namedecode = "default",
    3:optional string speakdecode,
    4:optional list<string> phonedecode,
}

struct HelloConDecode{
    1:optional list<HelloTestDecode> hellodecode,
}