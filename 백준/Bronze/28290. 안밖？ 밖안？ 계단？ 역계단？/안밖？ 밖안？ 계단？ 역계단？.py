def sol(s):
    if s == 'fdsajkl;' or s == 'jkl;fdsa':
        return 'in-out'
    elif s == 'asdf;lkj' or s == ';lkjasdf':
            return 'out-in'
    elif s == 'asdfjkl;' :
        return 'stairs'
    elif s == ';lkjfdsa' :
            return 'reverse'
    else:
        return 'molu'
 
 
if __name__ == '__main__':
    s = input()
    print(sol(s))