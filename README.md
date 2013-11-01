kija
====

Kija is a small programming language that aim to be used to teach algorithmics

One problem teachers have when they teach algorithm is that no existing programming language
is suitable to teach algorithmics.
Mainstream languages are 
 - too high level like Java or Ruby so students spend time to try master OOP
   (or worst try to use the language as if it's not object oriented). 
 - or languages like Python or PHP already have high level constructs for data structures
   like list, hash builtin
 - or language are too low level like C and managing the memory is more important
   the algorithm.

The goal of Kija is to be a simple yet powerful language that allows to describe and run algorithm easily

Before starting to introduce the syntax and the semantics of Kija,
let me show an example of kinked list:
``` OCAML
data Link(element', next)

def cons(element', link):
  return new Link(element', link)
  
def length(link):
  1 + length(link.next) or 0 if link.next == null
  
def main(args):
  list = cons(2, cons("foo", null))
```
and an example of hash map:
``` OCAML
data HashMap(entries, hashFun)
data HashMapEntry(key', value', next)
  
def get(map, key'):
  index = map.hashFun.apply(key') % map.entries.length()
  entry = map.entries[index]
  while entry != null:
    if entry.key' == key':
      return entry.value'
    end
    entry = entry.next
  end
  return null
  
def put(map, key', value'):
  index = map.hashFun.apply(key') % map.entries.length()
  entry = map.entries[index]
  while entry != null:
    if entry.key' == key':
      entry.value' = value'
      return
    end
    entry = entry.next
  end
  map.entries[index] = new HashMapEntry(key', value', map.entries[index])
  
def identity(value):
  value
  
def main(args):
  map = new HashMap(new Array(16), identity)
  put(map, 17, "foo")
  print get(map, 17)   // prints foo
  
```

