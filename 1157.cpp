#include <iostream>

using namespace std;

int main(void)
{    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    const int ALPHABET_NUM = 26;
    const string UPPER_CASE_LETTER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    const string LOWER_CASE_LETTER = "abcdefghijklmnopqrstuvwxyz";

    int numberOfAppearOfAlphabet[ALPHABET_NUM] = {0};
    string word;
    cin>>word;
    int len = word.length();
    for(int i = 0; i<len; i++)
    {
      for(int j = 0; j<ALPHABET_NUM; j++)
      {
        if(word[i] == UPPER_CASE_LETTER[j] || word[i] == LOWER_CASE_LETTER[j])
        {
          numberOfAppearOfAlphabet[j]++;    
        }
      }
    }

    int max = -1;
    char mostAppearAlpha;
    for(int i = 0; i<ALPHABET_NUM; i++)
    {
      if(numberOfAppearOfAlphabet[i]>max)
      {
        max = numberOfAppearOfAlphabet[i];
        mostAppearAlpha = UPPER_CASE_LETTER[i];
      }
      else if(max == numberOfAppearOfAlphabet[i])
      {
        mostAppearAlpha = '?';
      }
    }
    
    cout<<mostAppearAlpha<<"\n";
    return 0;
}